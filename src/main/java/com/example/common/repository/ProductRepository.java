package com.example.common.repository;

import com.example.common.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer>, QuerydslPredicateExecutor<Product> {
    Page<Product> findProductsByUserEmail(String email, Pageable pageable);

    Optional<Product> findByName(String name);

    @Query(value = "SELECT p.* FROM  product p order by p.rating desc limit 10", nativeQuery = true)
    List<Product> findTopTen();

}
