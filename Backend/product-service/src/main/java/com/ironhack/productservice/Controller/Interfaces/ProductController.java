package com.ironhack.productservice.Controller.Interfaces;

import com.ironhack.productservice.Controller.DTO.*;
import com.ironhack.productservice.Model.Product;

import java.util.List;

public interface ProductController {

    List<Product> findAll();
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
