package com.ironhack.selleruserservice.Controller.DTO;

import java.math.BigDecimal;

public class ProductPriceDTO {
    private BigDecimal price;

    public ProductPriceDTO(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
