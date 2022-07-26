package com.ironhack.edgeservice.Controller.DTO;

import com.ironhack.edgeservice.Classes.OrderItem;

import java.util.List;

public class OrderDTO {

    // Property
    private List<OrderItem> orderItems;

    // Constructor method

    public OrderDTO(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    // Getter and setter

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
