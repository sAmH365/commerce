package com.simple.commerce.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Slf4j
@NoArgsConstructor
@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String description;

    private Integer stockQuantity;

    private String imagePath;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    @OneToMany(mappedBy = "product")
    private List<Cart> cartItems = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Review> reviews = new ArrayList<>();

    @Builder
    public Product(String productName, String description, Integer stockQuantity) {
        this.productName = productName;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }
}
