package com.example.diagnostic.evaluation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diagnostic.evaluation.models.ProductModel;
import com.example.diagnostic.evaluation.repositories.IProductRepository;

@Service
public class ProductService {
    
    @Autowired
    IProductRepository productRepository;

    public ProductModel addProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public List<ProductModel> getSoldOutProducts(boolean soldOut) {
        return (List<ProductModel>) productRepository.findBySoldOut(soldOut);
    }

    public List<ProductModel> getAvailableProducts(boolean soldOut) {
        return (List<ProductModel>) productRepository.findBySoldOut(soldOut);
    }

    public Optional<ProductModel> updateStock(boolean soldOut, Long id) {
        Optional<ProductModel> product = productRepository.findById(id);
        if (product.isPresent()) {
            product.get().setSoldOut(soldOut);
            productRepository.save(product.get());
            return product;
        }

        return Optional.empty();
    }
}
