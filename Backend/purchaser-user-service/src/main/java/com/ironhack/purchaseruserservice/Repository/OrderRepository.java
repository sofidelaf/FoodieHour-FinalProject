package com.ironhack.purchaseruserservice.Repository;

import com.ironhack.purchaseruserservice.Model.Order;
import com.ironhack.purchaseruserservice.Model.OrderItem;
import com.ironhack.purchaseruserservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
