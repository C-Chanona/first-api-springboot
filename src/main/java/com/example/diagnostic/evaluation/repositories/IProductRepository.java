package com.example.diagnostic.evaluation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.diagnostic.evaluation.models.ProductModel;
import java.util.List;


@Repository
public interface IProductRepository extends JpaRepository<ProductModel, Long> {
    
    List<ProductModel> findBySoldOut(boolean soldOut);
}
