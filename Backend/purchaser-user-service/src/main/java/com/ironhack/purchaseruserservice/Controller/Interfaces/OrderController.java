package com.ironhack.purchaseruserservice.Controller.Interfaces;

import com.ironhack.purchaseruserservice.Controller.DTO.OrderDTO;
import com.ironhack.purchaseruserservice.Model.OrderItem;

public interface OrderController {
    OrderDTO addItemToCart(OrderItem orderItem);
    OrderDTO removeItemFromCart(Long id);
}
