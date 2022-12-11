package com.example.common.repository;

import com.example.common.entity.ProductGallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGalleryRepository extends JpaRepository<ProductGallery,Integer> {
}
