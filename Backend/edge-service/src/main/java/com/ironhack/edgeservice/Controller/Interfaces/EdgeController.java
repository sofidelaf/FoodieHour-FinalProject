package com.ironhack.edgeservice.Controller.Interfaces;

import com.ironhack.edgeservice.Classes.OrderItem;
import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Controller.DTO.*;

public interface EdgeController {

    // -- Purchaser user's methods -- //

    Product findProductByName(String productName);
    OrderDTO addItemToCart(OrderItem orderItem);
    OrderDTO removeItemFromCart(Long id);

    // -- Seller user's methods -- //

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
