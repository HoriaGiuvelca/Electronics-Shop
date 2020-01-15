package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;


public class IncarcatoareController implements Initializable {

    @FXML
    public TableView table;
    @FXML
    public TableColumn model;
    @FXML
    public TableColumn mufa;
    @FXML
    public TableColumn lungime;
    @FXML
    public TableColumn brand;
    @FXML
    public TableColumn gama;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void home(ActionEvent actionEvent) {
        Main.getInstance().display(Main.STARTPAGE);
    }
}
