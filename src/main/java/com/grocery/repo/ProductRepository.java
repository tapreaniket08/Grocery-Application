package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
