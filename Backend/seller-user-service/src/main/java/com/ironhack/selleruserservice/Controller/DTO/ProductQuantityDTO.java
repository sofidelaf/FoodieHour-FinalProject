package com.ironhack.selleruserservice.Controller.DTO;

public class ProductQuantityDTO {
    private int quantity;

    public ProductQuantityDTO(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
