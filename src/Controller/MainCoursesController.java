package Controller;

import Main.Meal;
import Main.Meals;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainCoursesController implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;

    private List<Meal> meals;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Meals obj=new Meals();
        meals=obj.getAppetizers();
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
