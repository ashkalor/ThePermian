package Controller;

import Model.Cart;
import Model.Main;
import Model.Meal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CartItemController {
    @FXML
    private Label mealLabel;

    @FXML
    private Label quantityLabel;

    @FXML
    private Label priceLabel;


    public void setMealItem(Meal meal) {
        double cartItemPrice;

        cartItemPrice=(meal.getMealPrice()*(Cart.cartItemsQuantity.get(meal.getMid())));
        mealLabel.setText(meal.getMealName());
        priceLabel.setText(Main.CURRENCY + cartItemPrice);
        quantityLabel.setText(String.valueOf(Cart.cartItemsQuantity.get(meal.getMid())));
    }




}

