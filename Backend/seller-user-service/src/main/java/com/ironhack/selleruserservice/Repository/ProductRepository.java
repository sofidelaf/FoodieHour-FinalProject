package com.ironhack.selleruserservice.Repository;

import com.ironhack.selleruserservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByProductName(String productName);

//    void delete(Long id);

    @Query(value = "SELECT sum(weightInKg) FROM Product")
    Double sumWeights();
    // SELECT SUM(weight_in_kg) FROM product;
}
