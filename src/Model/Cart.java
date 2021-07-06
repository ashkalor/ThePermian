package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static List<Meal> cartItems= new ArrayList<>();

    public List<Meal> getCartItems() {
        return cartItems;
    }

    public void addMealToCartByMid(String mid){
        Meal meal= getMealByMealId(mid);
        cartItems.add(meal);
    }
    public void removeMealByMid(String mid){
        Meal meal=getMealByMealId(mid);
        cartItems.remove(meal);
    }
    private Meal getMealByMealId(String mid) {
        Meal meal=null;
        List<Meal> meals= new Meals().getMeals();
        for(Meal m: meals){
            if(m.getMid().equals(mid)){
                meal=m;
                break;
            }
        }
        return meal;
    }

}
