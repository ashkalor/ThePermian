package Controller;

import Model.Main;
import Model.Meal;
import Model.Cart;
import javafx.event.ActionEvent;
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
    public void addToCartHandler(ActionEvent event){

        Cart cartObj = new Cart();

    }
}
