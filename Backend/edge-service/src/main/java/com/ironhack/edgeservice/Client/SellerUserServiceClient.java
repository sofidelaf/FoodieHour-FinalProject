package com.ironhack.edgeservice.Client;

import com.ironhack.edgeservice.Classes.Product;
import com.ironhack.edgeservice.Classes.PurchaserUser;
import com.ironhack.edgeservice.Classes.SellerUser;
import com.ironhack.edgeservice.Controller.DTO.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@FeignClient("seller-user-service")
public interface SellerUserServiceClient {

    @GetMapping("/seller-users")
    public SellerUser createSellerUser(@RequestBody SellerUser sellerUser);
    @GetMapping("/sum-weights")
    public Double sumWeights();

}
