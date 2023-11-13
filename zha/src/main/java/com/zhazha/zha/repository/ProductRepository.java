package com.zhazha.zha.repository;

import com.zhazha.zha.model.Product;

import reactor.core.publisher.Flux;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends R2dbcRepository<Customer, Integer>{
    Flux<Product> findByProductID(int id);

    Flux<Product> findByProductName(String name);
}
