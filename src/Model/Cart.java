package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Cart {

    public static List<Meal> cartItems = new ArrayList<>();
    public static TreeMap<String, Integer> cartItemsQuantity = new TreeMap<>();
    public static int quantity;

    public List<Meal> getCartItems() {
        return cartItems;
    }
    public void addMealToCartByMid(String mid) {
        Meal meal=getMealByMealId(mid);
        cartItems.add(meal);
    }

    public void removeMealById(String mid) {
        Meal meal=getMealByMealId(mid);
        cartItems.remove(meal);
    }
    public void  clearCart(){
        cartItems.clear();
    }

    private Meal getMealByMealId(String mid) {
        Meal meal = null;
        List<Meal> meals = new Meals().getMeals();
        for (Meal m : meals) {
            if (m.getMid().equals(mid)) {
                meal = m;
                cartItemsQuantity.put(mid,0);
                break;
            }
        }
        return meal;
    }

}
