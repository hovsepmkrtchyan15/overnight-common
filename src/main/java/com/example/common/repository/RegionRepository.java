package com.example.overnightweb.repository;

import am.itspace.overnight.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    List<Region> findByNameContaining(String keyword);


}
