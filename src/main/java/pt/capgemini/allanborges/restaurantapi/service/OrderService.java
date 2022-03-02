package pt.capgemini.allanborges.restaurantapi.service;

import pt.capgemini.allanborges.restaurantapi.entity.Order;
import java.util.List;

public interface OrderService {
    Order addMenu(Order menu);
    List<Order> getOrders();
    Order updateOrder(Integer orderId, Order order);
}
