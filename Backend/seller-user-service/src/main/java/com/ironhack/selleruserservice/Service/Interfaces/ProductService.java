package com.ironhack.selleruserservice.Service.Interfaces;

import com.ironhack.selleruserservice.Controller.DTO.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface ProductService {
    void updateProduct(Long id, ProductDTO productDTO);
    void updateProductName(Long id, ProductNameDTO productNameDTO);
    void updateProductQuantity(Long id, ProductQuantityDTO productQuantityDTO);
    void updateProductWeight(Long id, ProductWeightDTO productWeightDTO);
    void updateProductPrice(Long id, ProductPriceDTO productPriceDTO);
}
