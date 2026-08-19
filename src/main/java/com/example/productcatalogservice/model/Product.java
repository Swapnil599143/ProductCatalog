package com.example.productcatalogservice.model;

public class Product extends BaseEntity {
    private String productName;
    private String description;
    private String[] imageUrl;
    private Integer quantity;
    private Double price;
    private Double specialPrice;
    private Double discount;
    private Category category;
}
