package com.challenge.mercadolibre.meli_challenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String id;
    private String productName;
    private String imageUrl;
    private String description;
    private double price;
    private double rating;
    private String specifications;
}