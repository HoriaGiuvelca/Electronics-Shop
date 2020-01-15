package sample;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class ModeleController implements Initializable {
    @FXML
    public TableView table;
    @FXML
    public TableColumn brand;
    @FXML
    public TableColumn gama;
    @FXML
    public TableColumn model;
    @FXML
    public TableColumn camera;
    @FXML
    public TableColumn ram;
    @FXML
    public TableColumn memorie;
    @FXML
    public TableColumn garantie;
    @FXML
    public TableColumn stoc;
    @FXML
    public TableColumn pret;
    @FXML
    public TableColumn diagonala;
    @FXML
    public TextField camp_gama;
    @FXML
    public TextField camp_model;
    @FXML
    public TextField camp_camera;
    @FXML
    public TextField camp_ram;
    @FXML
    public TextField camp_memorie;
    @FXML
    public TextField camp_garantie;
    @FXML
    public TextField camp_stoc;
    @FXML
    public TextField camp_pret;
    @FXML
    public TextField camp_diagonala;
    @FXML
    public TextField camp_brand;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void add(ActionEvent e){
        Main.getInstance().display(Main.CLIENTI);
    }

}
