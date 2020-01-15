package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String STARTPAGE = "StartPage.fxml";
    private static Parent root = null;
    private static Stage stage = null;
    public static final String MODELE = "Modele.fxml";
    public static final String CLIENTI = "Clienti.fxml";
    public static final String STATISTICI = "statistici.fxml";


    private static Main instance = null;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        instance = this;
        stage = primaryStage;
        display(STATISTICI);
    }

    public void display(String name)
    {
        try {
            root = FXMLLoader.load(getClass().getResource(name));
            stage.setTitle("Magazin Tablete");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }






    public static void main(String[] args) {
        launch(args);
    }
}
