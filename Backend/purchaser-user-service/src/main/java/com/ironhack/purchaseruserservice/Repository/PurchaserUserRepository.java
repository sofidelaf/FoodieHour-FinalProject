package com.ironhack.purchaseruserservice.Repository;

import com.ironhack.purchaseruserservice.Model.PurchaserUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaserUserRepository extends JpaRepository<PurchaserUser, Long> {
}
