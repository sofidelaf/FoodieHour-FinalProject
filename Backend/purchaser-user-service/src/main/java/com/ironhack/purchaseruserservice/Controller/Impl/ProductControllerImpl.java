package com.ironhack.purchaseruserservice.Controller.Impl;

import com.ironhack.purchaseruserservice.Controller.Interfaces.ProductController;
import com.ironhack.purchaseruserservice.Model.Product;
import com.ironhack.purchaseruserservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByName(@RequestParam String productName) {
        Product product = productRepository.findProductByProductName(productName);
        return product;
    }
}
