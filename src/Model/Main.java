package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {


    public static boolean INCuisine=false;
    public static boolean FRCuisine= false;
    public static boolean ITCuisine=false;
    public static boolean MECuisine=false;
    public static boolean CHCuisine=false;
    public static boolean JACuisine=false;
    public static boolean ENCuisine=false;
    public static final  String CURRENCY="\u20B9";



    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Welcome.fxml")));
            primaryStage.setTitle("The Permian");
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
