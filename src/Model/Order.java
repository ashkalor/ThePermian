package Model;

import java.util.Objects;

public class Order {

    private Integer oid;
    private String orderName;
    private Integer orderQuantity;
    private Double orderPrice;

    public Order(Integer oid, String orderName, Integer orderQuantity, Double orderPrice) {
        this.oid = oid;
        this.orderName = orderName;
        this.orderQuantity = orderQuantity;
        this.orderPrice = orderPrice;
    }
    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(oid, order.oid) && Objects.equals(orderName, order.orderName) && Objects.equals(orderQuantity, order.orderQuantity) && Objects.equals(orderPrice, order.orderPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, orderName, orderQuantity, orderPrice);
    }
}
