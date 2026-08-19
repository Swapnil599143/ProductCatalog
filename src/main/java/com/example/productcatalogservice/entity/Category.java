package com.example.productcatalogservice.entity;

import java.util.List;

public class Category extends BaseEntity {
    private String categoryName;
    private List<Product> products;
}
