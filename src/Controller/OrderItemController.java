package Controller;



import Model.Cart;
import Model.Meal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderItemController {

    @FXML
    private Label mealLabel;

    @FXML
    private Label quantityLabel;

    public void setOrderItem(Meal meal) {
        mealLabel.setText(meal.getMealName());
        quantityLabel.setText("x" +String.valueOf(Cart.cartItemsQuantity.get(meal.getMid())));
    }

}

