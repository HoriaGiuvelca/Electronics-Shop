package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class StatisticiController implements Initializable {
    @FXML
    public TableView<RezultatQueryGreu> table;
    @FXML
    public TableColumn<RezultatQueryGreu, String> brand;
    @FXML
    public TableColumn<RezultatQueryGreu, String> gama;
    @FXML
    public TableColumn<RezultatQueryGreu, String> model;
    @FXML
    public TableColumn pret;
    @FXML
    public TextField camp_valoare;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
       brand.setCellValueFactory(new PropertyValueFactory<RezultatQueryGreu, String>("Brand"));
       brand.setCellFactory(TextFieldTableCell.forTableColumn());
       brand.setOnEditCommit(e -> schimbaBrand(e));

        gama.setCellValueFactory(new PropertyValueFactory<RezultatQueryGreu, String>("Gama"));
        gama.setCellFactory(TextFieldTableCell.forTableColumn());
        gama.setOnEditCommit(e -> schimbaGama(e));

        model.setCellValueFactory(new PropertyValueFactory<RezultatQueryGreu, String>("Model"));
        model.setCellFactory(TextFieldTableCell.forTableColumn());
        model.setOnEditCommit(e -> schimbaModel(e));

        pret.setCellValueFactory(new PropertyValueFactory<RezultatQueryGreu, String>("Pret"));
        pret.setCellFactory(TextFieldTableCell.forTableColumn());
        pret.setOnEditCommit(e -> schimbaPret(e));
        table.setEditable(true);
    }

    private void loadData() {
        DataBase.getInstance().loadDataIn(RepositoryRezultate.getInstance().getData());
        table.getItems().addAll(RepositoryRezultate.getInstance().getData());
    }

    private void schimbaPret(Event e) {
        TableColumn.CellEditEvent<RezultatQueryGreu, String> ce;
        ce = (TableColumn.CellEditEvent<RezultatQueryGreu, String>) e;
        RezultatQueryGreu b = ce.getRowValue();
        b.setPret(ce.getNewValue());
        DataBase.update(b);
    }

    private void schimbaModel(TableColumn.CellEditEvent<RezultatQueryGreu, String> e) {
    }

    private void schimbaGama(TableColumn.CellEditEvent<RezultatQueryGreu, String> e) {
    }

    private void schimbaBrand(TableColumn.CellEditEvent<RezultatQueryGreu, String> e) {
    }

    public void home(ActionEvent actionEvent) {
        Main.getInstance().display(Main.STARTPAGE);
    }
}
