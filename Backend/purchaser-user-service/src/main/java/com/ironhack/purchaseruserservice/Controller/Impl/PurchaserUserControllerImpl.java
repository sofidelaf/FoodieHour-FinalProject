package com.ironhack.purchaseruserservice.Controller.Impl;

import com.ironhack.purchaseruserservice.Controller.Interfaces.PurchaserUserController;
import com.ironhack.purchaseruserservice.Model.PurchaserUser;
import com.ironhack.purchaseruserservice.Repository.PurchaserUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaserUserControllerImpl implements PurchaserUserController {

    @Autowired
    private PurchaserUserRepository purchaserUserRepository;

    @PostMapping("purchaser-users")
    @ResponseStatus(HttpStatus.OK)
    public PurchaserUser createPurchaserUser(@RequestBody PurchaserUser purchaserUser) {
        return purchaserUserRepository.save(purchaserUser);
    }
}
