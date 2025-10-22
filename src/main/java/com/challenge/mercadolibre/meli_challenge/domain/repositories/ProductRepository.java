package com.challenge.mercadolibre.meli_challenge.domain.repositories;

import com.challenge.mercadolibre.meli_challenge.domain.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.*;

@Repository
public class ProductRepository {

    private final ObjectMapper mapper = new ObjectMapper();
    private final String fileName;

    //File name comes from application.properties
    public ProductRepository(@Value("${products.file.name}") String fileName) {
        this.fileName = fileName;
    }

    //Loads all products from the JSON file in classpath.
    public List<Product> findAll() {
        try (InputStream is = getClass().getResourceAsStream(fileName)) {
            if (is == null) {
                System.err.println("File not found: " + fileName);
                return Collections.emptyList();
            }
            return mapper.readValue(is, new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Error reading " + fileName + ": " + e.getMessage(), e);
        }
    }

    //Finds a product by ID.
    public Optional<Product> findById(String id) {
        return findAll().stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst();
    }


}