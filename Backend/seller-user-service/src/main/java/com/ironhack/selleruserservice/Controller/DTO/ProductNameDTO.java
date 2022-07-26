package com.ironhack.selleruserservice.Controller.DTO;

public class ProductNameDTO {
    private String productName;

    public ProductNameDTO(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
