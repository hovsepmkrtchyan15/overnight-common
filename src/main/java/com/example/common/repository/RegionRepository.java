package com.example.common.repository;

import com.example.common.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    List<Region> findByNameContaining(String keyword);

    Optional<Region> findByName(String name);

}
