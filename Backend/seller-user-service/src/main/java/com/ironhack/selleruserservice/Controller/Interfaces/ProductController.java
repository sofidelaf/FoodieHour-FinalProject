package com.ironhack.selleruserservice.Controller.Interfaces;

import com.ironhack.selleruserservice.Controller.DTO.*;
import com.ironhack.selleruserservice.Model.Product;

import java.math.BigDecimal;

public interface ProductController {
    Product findProductByProductName(String productName);
    Product createProduct(Product product);
    void removeProductById(Long id);
    void updateProduct(Long id, ProductDTO productDTO);
    void updateProductName(Long id, ProductNameDTO productNameDTO);
    void updateProductQuantity(Long id, ProductQuantityDTO productQuantityDTO);
    void updateProductWeight(Long id, ProductWeightDTO productWeightDTO);
    void updateProductPrice(Long id, ProductPriceDTO productPriceDTO);
    Double sumWeights();

}
