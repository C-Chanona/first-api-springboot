package com.example.diagnostic.evaluation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String catalog;

    @Column(nullable = false)
    private float cost;

    @Column(nullable = false)
    private int inStock;

    @Column(nullable = false)
    private boolean soldOut;

    // private void setSoldOut() {
    //     this.soldOut = false;
    // }
}