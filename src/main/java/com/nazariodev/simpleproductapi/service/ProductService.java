package com.nazariodev.simpleproductapi.service;


import com.nazariodev.simpleproductapi.entity.Product;
import com.nazariodev.simpleproductapi.exception.ProductNotFoundException;
import com.nazariodev.simpleproductapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Saves Product
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Finds Product
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product update(Long id, Product updated) {
        Product existing = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        existing.setName(updated.getName());
        existing.setPrice(updated.getPrice());
        return productRepository.save(existing);
    }

    // List's all products
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Delete's a product by id
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.delete(product);
    }
}

