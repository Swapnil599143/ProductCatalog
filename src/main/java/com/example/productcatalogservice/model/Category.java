package com.example.productcatalogservice.model;

import java.util.List;

public class Category extends BaseEntity {
    private String categoryName;
    private List<Product> products;
}
