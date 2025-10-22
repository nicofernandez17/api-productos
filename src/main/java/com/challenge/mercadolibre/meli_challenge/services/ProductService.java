package com.challenge.mercadolibre.meli_challenge.services;

import com.challenge.mercadolibre.meli_challenge.domain.Product;
import com.challenge.mercadolibre.meli_challenge.domain.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return repository.findById(id);
    }
}
