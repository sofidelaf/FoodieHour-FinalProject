package com.ironhack.edgeservice.Service.Interfaces;

import com.ironhack.edgeservice.Controller.DTO.*;

public interface EdgeService {
    void updateProduct(Long id, ProductDTO productDTO);
    void updateProductName(Long id, ProductNameDTO productNameDTO);
    void updateProductQuantity(Long id, ProductQuantityDTO productQuantityDTO);
    void updateProductWeight(Long id, ProductWeightDTO productWeightDTO);
    void updateProductPrice(Long id, ProductPriceDTO productPriceDTO);
}
