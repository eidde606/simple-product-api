package com.nazariodev.simpleproductapi.repository;

import com.nazariodev.simpleproductapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
