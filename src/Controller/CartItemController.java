package Controller;

import Model.Cart;
import Model.Main;
import Model.Meal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CartItemController {
    Cart cartObj = new Cart();


    @FXML
    private Label mealLabel;

    @FXML
    private Label quantityLabel;

    @FXML
    private Label priceLabel;

    private Meal meal;
    private Double cartItemPrice;

    public void setMealItem(Meal meal) {
        this.meal = meal;
        cartItemPrice=(meal.getMealPrice()*(Cart.cartItemsQuantity.get(meal.getMid())));
        mealLabel.setText(meal.getMealName());
        priceLabel.setText(Main.CURRENCY + cartItemPrice);
        quantityLabel.setText(String.valueOf(Cart.cartItemsQuantity.get(meal.getMid())));
    }



}

