package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private  List<Meal> meals;

    public  List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(meals, order.meals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meals);
    }
}

