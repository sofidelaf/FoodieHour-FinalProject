package com.ironhack.productservice.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Embeddable
public class Product {

    // --- Properties --- //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    private String productName;

    private int quantity;

    private double weightPerKg;

    private BigDecimal price;

    // --- Constructor methods --- //

    public Product() {
    }

    public Product(User user, String productName, int quantity, double weightPerKg, BigDecimal price) {
        this.user = user;
        this.productName = productName;
        this.quantity = quantity;
        this.weightPerKg = weightPerKg;
        this.price = price;
    }

    // --- Getters and setters --- //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeightPerKg() {
        return weightPerKg;
    }

    public void setWeightPerKg(double weightPerKg) {
        this.weightPerKg = weightPerKg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
