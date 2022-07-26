package com.ironhack.edgeservice.Controller.Impl;

import com.ironhack.edgeservice.Classes.OrderItem;
import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Service.Interfaces.EdgeService;
import com.ironhack.edgeservice.Client.PurchaserUserServiceClient;
import com.ironhack.edgeservice.Client.SellerUserServiceClient;
import com.ironhack.edgeservice.Controller.DTO.*;
import com.ironhack.edgeservice.Controller.Interfaces.EdgeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EdgeControllerImpl implements EdgeController {

    @Autowired
    private EdgeService edgeService;

    @Autowired
    private PurchaserUserServiceClient purchaserUserServiceClient;

    @Autowired
    private SellerUserServiceClient sellerUserServiceClient;

    // -- Purchaser user's implementation methods -- //

    @GetMapping("/products/buyer/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByName(@RequestParam String productName) {
        Product product = purchaserUserServiceClient.findProductByName(productName);
        return product;
    }

    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO addItemToCart(@RequestBody OrderItem orderItem) {
        return purchaserUserServiceClient.addItemToCart(orderItem);
    }

    @DeleteMapping("orders/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public OrderDTO removeItemFromCart(@PathVariable Long id) {
        return purchaserUserServiceClient.removeItemFromCart(id);
    }

    // -- Seller user's implementation methods -- //

    @GetMapping("/products/seller/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByProductName(@PathVariable String productName) {
        Product product = sellerUserServiceClient.findProductByProductName(productName);
        return product;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return sellerUserServiceClient.createProduct(product);
    }

    @DeleteMapping("/products")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeProductById(@PathVariable Long id) {
        sellerUserServiceClient.removeProductById(id);
    }

    @PatchMapping("/products/update-product")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduct(@RequestParam(name = "product_id") Long id, @RequestBody ProductDTO productDTO) {
        sellerUserServiceClient.updateProduct(id, productDTO);
    }

    @PatchMapping("/products/update-product-name")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductName(@RequestParam(name = "product_id") Long id, @RequestBody ProductNameDTO productNameDTO) {
        sellerUserServiceClient.updateProductName(id, productNameDTO);
    }

    @PatchMapping("/products/update-quantity")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductQuantity(@RequestParam(name = "product_id") Long id, @RequestBody ProductQuantityDTO productQuantityDTO) {
        sellerUserServiceClient.updateProductQuantity(id, productQuantityDTO);
    }

    @PatchMapping("/products/update-weight")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductWeight(@RequestParam(name = "product_id") Long id, @RequestBody ProductWeightDTO productWeightDTO) {
        sellerUserServiceClient.updateProductWeight(id, productWeightDTO);
    }

    @PatchMapping("/products/update-price")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductPrice(@RequestParam(name = "product_id") Long id, @RequestBody ProductPriceDTO productPriceDTO) {
        sellerUserServiceClient.updateProductPrice(id, productPriceDTO);
    }

    @GetMapping("/sum-weights")
    @ResponseStatus(HttpStatus.OK)
    public Double sumWeights() {
        return sellerUserServiceClient.sumWeights();
    }

}


