package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainMenuController {

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

    @FXML
    public void indianCuisineHandler(MouseEvent event) {
        if (INSelection.getStyleClass().contains("cuisine-selection")) {
            INSelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            INSelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void frenchCuisineHandler(MouseEvent event) {
        if (FRSelection.getStyleClass().contains("cuisine-selection")) {
            FRSelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            FRSelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void italianCuisineHandler(MouseEvent event) {
        if (ITSelection.getStyleClass().contains("cuisine-selection")) {
            ITSelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            ITSelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void mexicanCuisineHandler(MouseEvent event) {
        if (MESelection.getStyleClass().contains("cuisine-selection")) {
            MESelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            MESelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void chineseCuisineHandler(MouseEvent event) {
        if (CHSelection.getStyleClass().contains("cuisine-selection")) {
            CHSelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            CHSelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void japaneseCuisineHandler(MouseEvent event) {
        if (JASelection.getStyleClass().contains("cuisine-selection")) {
            JASelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            JASelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void englishCuisineHandler(MouseEvent event) {
        if (ENSelection.getStyleClass().contains("cuisine-selection")) {
            ENSelection.getStyleClass().removeAll("cuisine-selection");
        } else {
            ENSelection.getStyleClass().add("cuisine-selection");
        }
    }

    public void nextHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Appetizers.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}



