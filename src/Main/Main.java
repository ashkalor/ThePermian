package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    public boolean INCuisine=true;
    public boolean FRCuisine=false;
    public boolean ITCuisine=false;
    public boolean MECuisine=false;
    public boolean CHCuisine=false;
    public boolean JACuisine=false;
    public boolean ENCuisine=false;
    public static final  String CURRENCY="Rs. ";

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Welcome.fxml")));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);

    }
}
