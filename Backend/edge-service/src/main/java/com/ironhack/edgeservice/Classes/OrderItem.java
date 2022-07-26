package com.ironhack.edgeservice.Classes;

import java.math.BigDecimal;

public class OrderItem {

    private Long id;
    private Product product;
    private int quantityBought;
    private BigDecimal price;
    private Order order;

    public OrderItem(Long id, Product product, int quantityBought, BigDecimal price) {
        this.id = id;
        this.product = product;
        this.quantityBought = quantityBought;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantityBought() {
        return quantityBought;
    }

    public void setQuantityBought(int quantityBought) {
        this.quantityBought = quantityBought;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
