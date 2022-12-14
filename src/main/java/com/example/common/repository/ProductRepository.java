package com.example.common.repository;

import com.example.common.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer>, QuerydslPredicateExecutor<Product> {
    Page<Product> findProductsByUserId(int id, Pageable pageable);

    Optional<Product> findByName(String name);

@Query(value = "SELECT u FROM  Product  u WHERE u.rating = 5")
    List<Product> findByRatingTop20();

}
