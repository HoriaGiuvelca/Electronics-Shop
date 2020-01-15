package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientiController implements Initializable {

    @FXML
    public TableView table;
    @FXML
    public TableColumn nume;
    @FXML
    public TableColumn prenume;
    @FXML
    public TableColumn cnp;
    @FXML
    public TableColumn mail;
    @FXML
    public TableColumn telefon;
    @FXML
    public TableColumn producator;
    @FXML
    public TableColumn mail_producator;
    @FXML
    public TextField camp_nume;
    @FXML
    public TextField camp_prenume;
    @FXML
    public TextField camp_cnp;
    @FXML
    public TextField camp_mail;
    @FXML
    public TextField camp_telefon;
    @FXML
    public TextField camp_producator;
    @FXML
    public TextField camp_mail_producator;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void add(ActionEvent e){
        System.out.println(camp_prenume.getText());
    }

    public void home(ActionEvent actionEvent) {
        Main.getInstance().display(Main.STARTPAGE);
    }

    public void delete(ActionEvent actionEvent) {
    }
}
