package com.ironhack.purchaseruserservice.Controller.Interfaces;

import com.ironhack.purchaseruserservice.Model.PurchaserUser;
import org.springframework.web.bind.annotation.RequestBody;

public interface PurchaserUserController {
    PurchaserUser createPurchaserUser (@RequestBody PurchaserUser purchaserUser);
}
