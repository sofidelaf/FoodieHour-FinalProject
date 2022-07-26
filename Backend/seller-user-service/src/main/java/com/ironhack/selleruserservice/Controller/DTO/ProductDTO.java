package com.ironhack.selleruserservice.Controller.DTO;

import java.math.BigDecimal;

public class ProductDTO {

    private String productName;

    private int quantity;

    private double weightInKg;

    private BigDecimal price;

    public ProductDTO(String productName, int quantity, double weightInKg, BigDecimal price) {
        this.productName = productName;
        this.quantity = quantity;
        this.weightInKg = weightInKg;
        this.price = price;
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
