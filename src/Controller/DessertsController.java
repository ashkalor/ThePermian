package Controller;

import Main.Meal;
import Main.Meals;
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

public class DessertsController implements Initializable {

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

    public void finishHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Desserts.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void backHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/MainCourse.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Meals obj=new Meals();
        meals=obj.getDesserts();
        int column=0;
        int row=0;
        try {
        for(int i=0;i<meals.size();i++){
            FXMLLoader fxmlLoader=new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("../Views/MealItem.fxml"));
            HBox hbox=fxmlLoader.load();
            MealItemController mealItemController=fxmlLoader.getController();
            mealItemController.setMealItem(meals.get(i));
            grid.add(hbox,column,row++);


        }
        }catch (IOException e) {
        e.printStackTrace();
    }
    }
}
