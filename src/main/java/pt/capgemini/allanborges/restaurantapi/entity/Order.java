package pt.capgemini.allanborges.restaurantapi.entity;

public class Order {

    private int orderId;
    private String orderStatus;
    private String transactionID;
    private String orderDateTime;

    public Order() {
    }
    public Order(int orderId, String orderStatus, String transactionID, String orderDateTime) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.transactionID = transactionID;
        this.orderDateTime = orderDateTime;
    }

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
    public String getOrderDateTime() {
        return orderDateTime;
    }
    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", transactionID='" + transactionID + '\'' +
                ", orderDateTime='" + orderDateTime + '\'' +
                '}';
    }
}