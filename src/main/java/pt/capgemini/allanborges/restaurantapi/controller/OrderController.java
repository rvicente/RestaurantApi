package pt.capgemini.allanborges.restaurantapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.capgemini.allanborges.restaurantapi.entity.Order;
import pt.capgemini.allanborges.restaurantapi.service.OrderService;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/api/v1/addOrder")
    public Order addOrder(@RequestBody Order order){
        return orderService.addMenu(order);
    }

    @PostMapping("/api/v1/getOrder")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/api/v1/updateOrder/{id}")
    public Order updateOrder(@PathVariable("id") Integer orderId, @RequestBody Order order){
        return orderService.updateOrder(orderId, order);
    }

}