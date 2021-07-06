package Model;

import java.util.Objects;

public class Meal {

    private String mid;
    private String mealName;
    private Double mealPrice;

    public Meal(String mid,String mealName,Double mealPrice){
        this.mealName=mealName;
        this.mealPrice=mealPrice;
        this.mid=mid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public Double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(Double mealPrice) {
        this.mealPrice = mealPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal meal)) return false;
        return Objects.equals(mid, meal.mid) && Objects.equals(mealName, meal.mealName) && Objects.equals(mealPrice, meal.mealPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, mealName, mealPrice);
    }
}
