package Controller;

import Model.Main;
import Model.Meal;
import Model.Cart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class MealItemController {
    Cart cartObj = new Cart();
    @FXML
    private Label mealName;
    @FXML
    private Label mealPrice;
    @FXML
    private Button removeMeal;
    @FXML
    private Label mealLabel;
    @FXML
    private Button addMeal;
    private Meal meal;

    public void setMealItem(Meal meal) {
        this.meal = meal;
        mealName.setText(meal.getMealName());
        mealPrice.setText(Main.CURRENCY + meal.getMealPrice());
    }

    public void addHandler() {
        mealLabel.setOnMouseClicked(e -> {
            cartObj.addMealToCartByMid(meal.getMid());
            removeMeal.setVisible(true);
            removeMeal.setDisable(false);
            addMeal.setVisible(true);
            mealLabel.setText("1");
            Cart obj = new Cart();
            System.out.println(obj.getCartItems());

        });

    }

    public void addToCartHandler(ActionEvent event) {
        int quantity;
            try{
            quantity = Integer.parseInt(mealLabel.getText());
        }
        catch (Exception e){
                quantity=0;
        }
        cartObj.addMealToCartByMid(meal.getMid());
        removeMeal.setVisible(true);
        removeMeal.setDisable(false);
        addMeal.setVisible(true);
        mealLabel.setText(String.valueOf(++quantity));
        Cart obj = new Cart();
        System.out.println(obj.getCartItems());

    }

    public void removeFromCartHandler(ActionEvent event) {
        int quantity = Integer.parseInt(mealLabel.getText());
        try {
            if (Integer.parseInt(mealLabel.getText()) == 1) {
                removeMeal.setVisible(false);
                removeMeal.setDisable(true);
                addMeal.setVisible(false);
                mealLabel.setText("ADD");
            }
            cartObj.removeMealById(meal.getMid());
            if (mealLabel.getText() != "ADD")
                mealLabel.setText(String.valueOf(--quantity));

            System.out.println(Cart.cartItems);
        }catch (Exception e){
            cartObj.removeMealById(meal.getMid());
            if (mealLabel.getText() != "ADD")
                mealLabel.setText(String.valueOf(--quantity));
        }
    }


}

