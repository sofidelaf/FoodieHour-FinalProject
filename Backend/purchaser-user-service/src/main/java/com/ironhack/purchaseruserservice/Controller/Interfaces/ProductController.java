package com.ironhack.purchaseruserservice.Controller.Interfaces;

import com.ironhack.purchaseruserservice.Model.OrderItem;
import com.ironhack.purchaseruserservice.Model.Product;

import java.util.List;

public interface ProductController {
    Product findProductByName(String productName);
}
