package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    @FXML
    private Label INSelection;

    @FXML
    private Label FRSelection;

    @FXML
    private Label ITSelection;

    @FXML
    private Label MESelection;

    @FXML
    private Label CHSelection;

    @FXML
    private Label JASelection;

    @FXML
    private Label ENSelection;
    private Scene scene;
    private Stage stage;
    private Parent root;

    public void indianCuisineHandler(MouseEvent event) {

        if (INSelection.getStyleClass().contains("cuisine-selection")) {
            INSelection.getStyleClass().removeAll("cuisine-selection");
            Main.INCuisine=false;

        } else {
            INSelection.getStyleClass().add("cuisine-selection");
            Main.INCuisine=true;
        }
    }

    public void frenchCuisineHandler(MouseEvent event) {
        if (FRSelection.getStyleClass().contains("cuisine-selection")) {
            FRSelection.getStyleClass().removeAll("cuisine-selection");
            Main.FRCuisine=false;
        } else {
            FRSelection.getStyleClass().add("cuisine-selection");
            Main.FRCuisine=true;
        }
    }

    public void italianCuisineHandler(MouseEvent event) {
        if (ITSelection.getStyleClass().contains("cuisine-selection")) {
            ITSelection.getStyleClass().removeAll("cuisine-selection");
            Main.ITCuisine=false;
        } else {
            ITSelection.getStyleClass().add("cuisine-selection");
            Main.ITCuisine=true;
        }
    }

    public void mexicanCuisineHandler(MouseEvent event) {
        if (MESelection.getStyleClass().contains("cuisine-selection")) {
            MESelection.getStyleClass().removeAll("cuisine-selection");
            Main.MECuisine=false;
        } else {
            MESelection.getStyleClass().add("cuisine-selection");
            Main.MECuisine=true;
        }
    }

    public void chineseCuisineHandler(MouseEvent event) {
        if (CHSelection.getStyleClass().contains("cuisine-selection")) {
            CHSelection.getStyleClass().removeAll("cuisine-selection");
            Main.CHCuisine=false;
        } else {
            CHSelection.getStyleClass().add("cuisine-selection");
            Main.CHCuisine=true;
        }
    }

    public void japaneseCuisineHandler(MouseEvent event) {
        if (JASelection.getStyleClass().contains("cuisine-selection")) {
            JASelection.getStyleClass().removeAll("cuisine-selection");
            Main.JACuisine=false;
        } else {
            JASelection.getStyleClass().add("cuisine-selection");
            Main.JACuisine=true;
        }
    }

    public void englishCuisineHandler(MouseEvent event) {
        if (ENSelection.getStyleClass().contains("cuisine-selection")) {
            ENSelection.getStyleClass().removeAll("cuisine-selection");
            Main.ENCuisine=false;
        } else {
            ENSelection.getStyleClass().add("cuisine-selection");
            Main.ENCuisine=true;
        }
    }

    public void nextHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Appetizers.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(Main.INCuisine){
            INSelection.getStyleClass().add("cuisine-selection");
        }
        if(Main.ITCuisine){
            ITSelection.getStyleClass().add("cuisine-selection");
        }
        if(Main.FRCuisine){
            FRSelection.getStyleClass().add("cuisine-selection");
        }if(Main.MECuisine){
            MESelection.getStyleClass().add("cuisine-selection");
        }if(Main.CHCuisine){
            CHSelection.getStyleClass().add("cuisine-selection");
        }if(Main.JACuisine){
            JASelection.getStyleClass().add("cuisine-selection");
        }
        if(Main.ENCuisine){
            ENSelection.getStyleClass().add("cuisine-selection");
        }
    }
}



