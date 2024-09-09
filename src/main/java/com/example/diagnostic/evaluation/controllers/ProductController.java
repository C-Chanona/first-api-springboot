package com.example.diagnostic.evaluation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diagnostic.evaluation.models.ProductModel;
import com.example.diagnostic.evaluation.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/soldout")
    public List<ProductModel> getSoldOutProducts() {
        return this.productService.getSoldOutProducts(true);
    }
    
    @GetMapping("/available")
    public List<ProductModel> getAvailableProducts() {
        return this.productService.getAvailableProducts(false);
    }

    @PostMapping("/add")
    public ProductModel addProduct(@RequestBody ProductModel product) {
        return this.productService.addProduct(product);
    }

    @PatchMapping("/update/{id}")
    public Optional<ProductModel> updateStateProduct(@RequestBody boolean isAvailable, @PathVariable Long id) {
        return this.productService.updateStock(isAvailable, id);
    }
    
}
