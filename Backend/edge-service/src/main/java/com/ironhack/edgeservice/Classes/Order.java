package com.ironhack.edgeservice.Classes;
import java.util.List;

public class Order {

    // --- Properties --- //

    private Long id;
    private PurchaserUser purchaserUser;
    private List<OrderItem> orderItems;

    // --- Constructor methods --- //

    public Order() {
    }

    public Order(PurchaserUser purchaserUser, List<OrderItem> orderItems) {
        this.purchaserUser = purchaserUser;
        this.orderItems = orderItems;
    }

    // --- Getters and setters --- //


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PurchaserUser getPurchaserUser() {
        return purchaserUser;
    }

    public void setPurchaserUser(PurchaserUser purchaserUser) {
        this.purchaserUser = purchaserUser;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

}
