package com.ironhack.purchaseruserservice.Controller.Impl;

import com.ironhack.purchaseruserservice.Controller.DTO.OrderDTO;
import com.ironhack.purchaseruserservice.Controller.Interfaces.OrderController;
import com.ironhack.purchaseruserservice.Model.OrderItem;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderControllerImpl implements OrderController {

    /*
    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO addItemToCart(OrderItem orderItem) {
        OrderDTO orderItems = new OrderDTO(List<OrderItem>);
        ((List<OrderItem>) orderItems).add(orderItem);
        orderItems.setOrderItems(List<OrderItem>);
        return orderItems;
    }
     */

    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO addItemToCart(@RequestBody OrderItem orderItem) {
        return null;
    }

    @DeleteMapping("orders/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public OrderDTO removeItemFromCart(@PathVariable Long id) {
        return null;
    }
}
