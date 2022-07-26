package com.ironhack.edgeservice.Client;

import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Controller.DTO.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@FeignClient("seller-user-service")
public interface SellerUserServiceClient {

    @GetMapping("/products/{productName}")
    public Product findProductByProductName(@PathVariable String productName);

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product);

    @DeleteMapping("/products/{id}")
    public void removeProductById(@PathVariable Long id);

    @PatchMapping("/products/update-product")
    public void updateProduct(@RequestParam(name = "product_id") Long id, @RequestBody ProductDTO productDTO);

    @PatchMapping("/products/update-product-name")
    public void updateProductName(@RequestParam(name = "product_id") Long id, @RequestBody ProductNameDTO productNameDTO);


    @PatchMapping("/products/update-quantity")
    public void updateProductQuantity(@RequestParam(name = "product_id") Long id, @RequestBody ProductQuantityDTO productQuantityDTO);


    @PatchMapping("/products/update-weight")
    public void updateProductWeight(@RequestParam(name = "product_id") Long id, @RequestBody ProductWeightDTO productWeightDTO);


    @PatchMapping("/products/update-price")
    public void updateProductPrice(@RequestParam(name = "product_id") Long id, @RequestBody ProductPriceDTO productPriceDTO);

    @GetMapping("/sum-weights")
    public Double sumWeights();

}
