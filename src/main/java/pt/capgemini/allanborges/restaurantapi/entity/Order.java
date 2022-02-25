package pt.capgemini.allanborges.restaurantapi.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "order_asb")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer orderId;

    @Column(name = "orderStatus", nullable = false)
    private String orderStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderDateTime", nullable = false)
    private Date orderDateTime;

    @Column(name = "transactionId", nullable = false)
    private String transactionId;

    @PrePersist
    private void onCreate(){
        orderDateTime = new Date();
        transactionId = UUID.randomUUID().toString();
    }

    public Order() {
    }
    public Order(Integer orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }
    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDateTime=" + orderDateTime +
                '}';
    }
}