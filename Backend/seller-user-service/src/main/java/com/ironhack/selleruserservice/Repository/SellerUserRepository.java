package com.ironhack.selleruserservice.Repository;

import com.ironhack.selleruserservice.Model.SellerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerUserRepository extends JpaRepository<SellerUser, Long> {
}
