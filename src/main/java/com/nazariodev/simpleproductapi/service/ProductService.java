package com.nazariodev.simpleproductapi.service;


import com.nazariodev.simpleproductapi.entity.Product;
import com.nazariodev.simpleproductapi.exception.ProductNotFoundException;
import com.nazariodev.simpleproductapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}

