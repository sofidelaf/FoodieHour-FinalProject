package com.ironhack.productservice.Repository;

import com.ironhack.productservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();
    Product findProductByProductName(String productName);

//    void delete(Long id);

    @Query(value = "SELECT sum(weightInKg) FROM Product")
    Double sumWeights();
    // SELECT SUM(weight_in_kg) FROM product;
}
