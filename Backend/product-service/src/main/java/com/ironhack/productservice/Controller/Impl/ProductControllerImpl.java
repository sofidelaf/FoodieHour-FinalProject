package com.ironhack.productservice.Controller.Impl;

import com.ironhack.productservice.Controller.DTO.*;
import com.ironhack.productservice.Controller.Interfaces.ProductController;
import com.ironhack.productservice.Model.Product;
import com.ironhack.productservice.Repository.ProductRepository;
import com.ironhack.productservice.Service.Interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByProductName(@PathVariable String productName) {
        Product product = productRepository.findProductByProductName(productName);
        return product;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @Override
    public void removeProductById(@PathVariable Long id) {
    }

//    @DeleteMapping("/products")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void removeProductById(@PathVariable(name = "product_id") Long id) {
//        productRepository.delete(id);
//    }

    @PatchMapping("/products/update-product")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduct(@PathVariable(name = "product_id") Long id, @RequestBody ProductDTO productDTO) {
        productService.updateProduct(id, productDTO);
    }

    @PatchMapping("/products/update-product-name")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductName(@PathVariable(name = "product_id") Long id, @RequestBody ProductNameDTO productNameDTO) {
        productService.updateProductName(id, productNameDTO);
    }

    @PatchMapping("/products/update-quantity")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductQuantity(@PathVariable(name = "product_id") Long id, @RequestBody ProductQuantityDTO productQuantityDTO) {
        productService.updateProductQuantity(id, productQuantityDTO);
    }

    @PatchMapping("/products/update-weight")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductWeight(@PathVariable(name = "product_id") Long id, @RequestBody ProductWeightDTO productWeightDTO) {
        productService.updateProductWeight(id, productWeightDTO);
    }

    @PatchMapping("/products/update-price")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductPrice(@PathVariable(name = "product_id") Long id, @RequestBody ProductPriceDTO productPriceDTO) {
        productService.updateProductPrice(id, productPriceDTO);
    }

    @GetMapping("/sum-weights")
    @ResponseStatus(HttpStatus.OK)
    public Double sumWeights() {
        return productRepository.sumWeights();
    }

}
