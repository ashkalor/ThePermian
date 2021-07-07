package Model;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private Order order;
    private static final Orders INSTANCE= new Orders();


    private List<Order> orders=new ArrayList<>();

    private Orders(){

    }
    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static Orders getINSTANCE() {
        return INSTANCE;
    }
}
