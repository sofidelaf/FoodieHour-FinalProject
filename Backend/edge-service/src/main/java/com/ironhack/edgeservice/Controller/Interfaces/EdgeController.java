package com.ironhack.edgeservice.Controller.Interfaces;

import com.ironhack.edgeservice.Classes.OrderItem;
import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Classes.PurchaserUser;
import com.ironhack.edgeservice.Classes.SellerUser;
import com.ironhack.edgeservice.Controller.DTO.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EdgeController {

    // -- Purchaser user's methods -- //
    PurchaserUser createPurchaserUser(@RequestBody PurchaserUser purchaserUser);
    OrderDTO addItemToCart(@RequestBody OrderItem orderItem);
    OrderDTO removeItemFromCart(@PathVariable Long id);

    // -- Seller user's methods -- //

    SellerUser createSellerUser(@RequestBody SellerUser sellerUser);
    Double sumWeights();

    // -- Product's methods -- //

    List<Product> findAll();

    Product findProductByProductName(@PathVariable String productName);

    public Product createProduct(@RequestBody Product product);

    public void removeProductById(@PathVariable Long id);

    public void updateProduct(@RequestParam(name = "product_id") Long id, @RequestBody ProductDTO productDTO);

    public void updateProductName(@RequestParam(name = "product_id") Long id, @RequestBody ProductNameDTO productNameDTO);

    public void updateProductQuantity(@RequestParam(name = "product_id") Long id, @RequestBody ProductQuantityDTO productQuantityDTO);

    public void updateProductWeight(@RequestParam(name = "product_id") Long id, @RequestBody ProductWeightDTO productWeightDTO);

    public void updateProductPrice(@RequestParam(name = "product_id") Long id, @RequestBody ProductPriceDTO productPriceDTO);

}
