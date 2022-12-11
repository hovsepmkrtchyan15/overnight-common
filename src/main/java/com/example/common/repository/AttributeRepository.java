package com.example.common.repository;

import com.example.common.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AttributeRepository extends JpaRepository<Attribute, Integer> {
    List<Attribute> findByNameContaining(String keyword);
}
