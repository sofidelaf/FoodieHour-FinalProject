package com.ironhack.purchaseruserservice.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_order")
public class Order {

    // --- Properties --- //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "purchaser_user_id")
    private PurchaserUser purchaserUser;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderItem> orderItems;

    // --- Constructor methods --- //

    public Order() {
    }

    public Order(List<OrderItem> orderItems) {
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
