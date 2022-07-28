package com.ironhack.edgeservice.Controller.Impl;

import com.ironhack.edgeservice.Classes.OrderItem;
import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Classes.PurchaserUser;
import com.ironhack.edgeservice.Classes.SellerUser;
import com.ironhack.edgeservice.Client.ProductClient;
import com.ironhack.edgeservice.Service.Interfaces.EdgeService;
import com.ironhack.edgeservice.Client.PurchaserUserServiceClient;
import com.ironhack.edgeservice.Client.SellerUserServiceClient;
import com.ironhack.edgeservice.Controller.DTO.*;
import com.ironhack.edgeservice.Controller.Interfaces.EdgeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EdgeControllerImpl implements EdgeController {

    @Autowired
    private EdgeService edgeService;

    @Autowired
    private PurchaserUserServiceClient purchaserUserServiceClient;

    @Autowired
    private SellerUserServiceClient sellerUserServiceClient;

    @Autowired
    private ProductClient productClient;

    // -- Purchaser user's implementation methods -- //

    @PostMapping("/purchaser-users")
    @ResponseStatus(HttpStatus.OK)
    public PurchaserUser createPurchaserUser(@RequestBody PurchaserUser purchaserUser) {
        return purchaserUserServiceClient.createPurchaserUser(purchaserUser);
    }

    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO addItemToCart(@RequestBody OrderItem orderItem) {
        return purchaserUserServiceClient.addItemToCart(orderItem);
    }

    @DeleteMapping("/orders/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public OrderDTO removeItemFromCart(@PathVariable Long id) {
        return purchaserUserServiceClient.removeItemFromCart(id);
    }

    // -- Seller user's implementation methods -- //

    @PostMapping("/seller-users")
    @ResponseStatus(HttpStatus.OK)
    public SellerUser createSellerUser(SellerUser sellerUser) {
        return sellerUserServiceClient.createSellerUser(sellerUser);
    }

    @GetMapping("/sum-weights")
    @ResponseStatus(HttpStatus.OK)
    public Double sumWeights() {
        return sellerUserServiceClient.sumWeights();
    }

    // -- Product's implementation methods -- //

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productClient.findAll();
    }

    @GetMapping("/products/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByProductName(@PathVariable String productName) {
        return null;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return productClient.createProduct(product);
    }

    @DeleteMapping("/products/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeProductById(@PathVariable Long id) {
        productClient.removeProductById(id);
    }

    @PatchMapping("/products/update-product")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduct(@RequestParam(name = "product_id") Long id, @RequestBody ProductDTO productDTO) {
        productClient.updateProduct(id, productDTO);
    }

    @PatchMapping("/products/update-product-name")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductName(@RequestParam(name = "product_id") Long id, @RequestBody ProductNameDTO productNameDTO) {
        productClient.updateProductName(id, productNameDTO);
    }

    @PatchMapping("/products/update-quantity")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductQuantity(@RequestParam(name = "product_id") Long id, @RequestBody ProductQuantityDTO productQuantityDTO) {
        productClient.updateProductQuantity(id, productQuantityDTO);
    }

    @PatchMapping("/products/update-weight")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductWeight(@RequestParam(name = "product_id") Long id, @RequestBody ProductWeightDTO productWeightDTO) {
        productClient.updateProductWeight(id, productWeightDTO);
    }

    @PatchMapping("/products/update-price")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProductPrice(@RequestParam(name = "product_id") Long id, @RequestBody ProductPriceDTO productPriceDTO) {
        productClient.updateProductPrice(id, productPriceDTO);
    }

}


