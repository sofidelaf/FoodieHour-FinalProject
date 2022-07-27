package com.ironhack.selleruserservice.Controller.Interfaces;

import com.ironhack.selleruserservice.Model.SellerUser;
import org.springframework.web.bind.annotation.RequestBody;

public interface SellerUserController {
    SellerUser createSellerUser(@RequestBody SellerUser sellerUser);
}
