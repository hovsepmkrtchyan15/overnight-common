package com.example.common.repository;

import com.example.common.entity.Attribute;
import com.example.common.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface AttributeRepository extends JpaRepository<Attribute, Integer> {
    List<Attribute> findByNameContaining(String keyword);

    Optional<Attribute> findByName(String name);
}
