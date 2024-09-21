package homework.onlineShop.model;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String orId;//orderId
    private String userId;
    private Product product;
    private Date date;
    private double orPrice;
    private OrderStatus orderStatus;
    private int orQty;
    private PaymentMethod paymentMethod;

public Order(){

}

    public Order(String orId, String userId, Product product, Date date, double orPrice, OrderStatus orderStatus, int orQty, PaymentMethod paymentMethod) {
        this.orId = orId;
        this.userId = userId;
        this.product = product;
        this.date = date;
        this.orPrice = orPrice;
        this.orderStatus = orderStatus;
        this.orQty = orQty;
        this.paymentMethod = paymentMethod;
    }

    public String getOrId() {
        return orId;
    }

    public void setOrId(String orId) {
        this.orId = orId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getOrPrice() {
        return orPrice;
    }

    public void setOrPrice(double orPrice) {
        this.orPrice = orPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrQty() {
        return orQty;
    }

    public void setOrQty(int orQty) {
        this.orQty = orQty;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;
        return Double.compare(orPrice, order.orPrice) == 0 && orQty == order.orQty && Objects.equals(orId, order.orId) && Objects.equals(userId, order.userId) && Objects.equals(product, order.product) && Objects.equals(date, order.date) && orderStatus == order.orderStatus && paymentMethod == order.paymentMethod;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(orId);
        result = 31 * result + Objects.hashCode(userId);
        result = 31 * result + Objects.hashCode(product);
        result = 31 * result + Objects.hashCode(date);
        result = 31 * result + Double.hashCode(orPrice);
        result = 31 * result + Objects.hashCode(orderStatus);
        result = 31 * result + orQty;
        result = 31 * result + Objects.hashCode(paymentMethod);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orId='" + orId + '\'' +
                ", userId='" + userId + '\'' +
                ", product=" + product +
                ", date=" + date +
                ", orPrice=" + orPrice +
                ", orderStatus=" + orderStatus +
                ", orQty=" + orQty +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
