package com.example.common.repository;

import com.example.common.dto.ProductFilterDto;
import com.example.common.entity.Product;
import com.example.common.entity.QProduct;
import com.querydsl.jpa.JPAQueryBase;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CustomProductRepository {


    @PersistenceContext
    private EntityManager entityManager;


    public List<Product> products(ProductFilterDto productFilterDto) {
        QProduct qProduct = QProduct.product;
        JPAQuery jpaQuery = new JPAQuery(entityManager);
        JPAQueryBase from = jpaQuery.from(qProduct);

        if (productFilterDto.getName() != null && !productFilterDto.getName().equals("")) {
            from.where(qProduct.name.contains(productFilterDto.getName()));
        }
        if (productFilterDto.getAddress() != null && !productFilterDto.getAddress().equals("")) {
            from.where(qProduct.address.contains(productFilterDto.getAddress()));
        }
        if (productFilterDto.getRating() != 0) {
            from.where(qProduct.rating.eq(productFilterDto.getRating()));
        }
        if (productFilterDto.getType() != null) {
            from.where(qProduct.type.eq(productFilterDto.getType()));
        }
        return from.fetch();
    }

}
