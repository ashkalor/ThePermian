package Model;

import java.util.*;

public class Orders {

    public static void setOrders(List<List<Meal>> orders) {
        Orders.orders = orders;
    }

    private static List<List<Meal>> orders= new ArrayList<>();
    public static TreeMap<Integer,List<Meal>> orderIds = new TreeMap<>() ;
    public static void addOrders(List<Meal> order){
        orders.add(order);

    }
    public static List<List<Meal>> getOrders() {
        return orders;
    }

}

