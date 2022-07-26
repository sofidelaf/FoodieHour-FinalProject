package com.ironhack.edgeservice.Classes;

import java.math.BigDecimal;

// @Embeddable
public class Product {

    // --- Properties --- //

    private Long id;
    private String productName;
    private int quantity;
    private double weightInKg;
    private BigDecimal price;

    private OrderItem orderItem;

    // --- Constructor methods --- //

    public Product() {
    }

    public Product(String productName, int quantity, double weightInKg, BigDecimal price) {
        this.productName = productName;
        this.quantity = quantity;
        this.weightInKg = weightInKg;
        this.price = price;
    }

    // --- Getters and setters --- //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
