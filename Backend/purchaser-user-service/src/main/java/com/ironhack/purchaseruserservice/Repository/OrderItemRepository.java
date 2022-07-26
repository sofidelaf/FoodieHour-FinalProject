package com.ironhack.purchaseruserservice.Repository;

import com.ironhack.purchaseruserservice.Model.OrderItem;
import com.ironhack.purchaseruserservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
