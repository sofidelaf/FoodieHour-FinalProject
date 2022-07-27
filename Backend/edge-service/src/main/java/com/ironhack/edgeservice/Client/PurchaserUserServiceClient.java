package com.ironhack.edgeservice.Client;

import com.ironhack.edgeservice.Classes.OrderItem;
import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Classes.PurchaserUser;
import com.ironhack.edgeservice.Controller.DTO.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("purchaser-user-service")
public interface PurchaserUserServiceClient {

    @PostMapping("/purchaser-users")
    public PurchaserUser createPurchaserUser(@RequestBody PurchaserUser purchaserUser);

    @PostMapping("orders")
    public OrderDTO addItemToCart(@RequestBody OrderItem orderItem);

    @DeleteMapping("orders/{id}")
    public OrderDTO removeItemFromCart(@PathVariable Long id);

}

