package com.ironhack.selleruserservice.Service.Impl;

import com.ironhack.selleruserservice.Controller.Interfaces.SellerUserController;
import com.ironhack.selleruserservice.Model.SellerUser;
import com.ironhack.selleruserservice.Repository.SellerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.GeneratedValue;

public class SellerUserControllerImpl implements SellerUserController {

    @Autowired
    private SellerUserRepository sellerUserRepository;

    @PostMapping("/seller-users")
    @ResponseStatus(HttpStatus.OK)
    public SellerUser createSellerUser(@RequestBody SellerUser sellerUser) {
        return sellerUserRepository.save(sellerUser);
    }
}
