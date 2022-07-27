package com.ironhack.selleruserservice.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Embeddable
public class Product {

    // --- Properties --- //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String productName;

    private int quantity;

    private double weightInKg;

    private BigDecimal price;

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

    public void setWeightInKg(double weightPerKg) {
        this.weightInKg = weightPerKg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}