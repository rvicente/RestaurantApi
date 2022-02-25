package pt.capgemini.allanborges.restaurantapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.capgemini.allanborges.restaurantapi.entity.Order;
import pt.capgemini.allanborges.restaurantapi.repository.OrderRepository;
import java.util.List;
import java.util.Objects;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order addMenu(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    @Override
    public Order updateOrder(Integer orderId, Order order) {
        Order ord = orderRepository.findById(orderId).get();

        if(Objects.nonNull(order.getOrderStatus()) && !"".equalsIgnoreCase(order.getOrderStatus())) {
            ord.setOrderStatus(order.getOrderStatus());
        }

        return orderRepository.save(ord);
    }
}
