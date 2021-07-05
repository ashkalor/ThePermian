package Controller;

import Main.Main;
import Main.Meal;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MealItemController {
    @FXML
    private Label mealName;

    @FXML
    private Label mealPrice;

    @FXML
    private Button removeMeal;

    @FXML
    private TextField mealQuantity;

    @FXML
    private Button addMeal;

    private Meal meal;

    public void setMealItem(Meal meal){
        this.meal=meal;
        mealName.setText(meal.getMealName());
        mealPrice.setText(Main.CURRENCY +meal.getMealPrice());
    }
}
