package com.simple.commerce.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
@Getter
@NoArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String paymentMethod;

    private String shippingAddress;

    private BigDecimal totalPrice;

    private String discountCode;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    @Builder
    public Orders(String status, String paymentMethod, String shippingAddress, BigDecimal totalPrice, String discountCode) {
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
        this.totalPrice = totalPrice;
        this.discountCode = discountCode;
    }
}
