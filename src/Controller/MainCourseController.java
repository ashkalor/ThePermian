package Controller;

import Model.Main;
import Model.Meal;
import Model.Meals;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainCourseController implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;

    private List<Meal> meals;
    private Scene scene;
    private Stage stage;
    private Parent root;

    public void nextHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Desserts.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void backHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Appetizers.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void mainMenuHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/MainMenu.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Meals obj=new Meals();
        meals=obj.getMainCourses();
        int column=0;
        int row=0;
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        try {
            for (Meal meal : meals) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../Views/MealItem.fxml"));
                HBox hbox = fxmlLoader.load();
                MealItemController mealItemController = fxmlLoader.getController();
                mealItemController.setMealItem(meal);
                grid.add(hbox, column, row++);


            }
        }catch (IOException e) {
        e.printStackTrace();
    }
    }
}
