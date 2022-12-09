package com.example.spring_aplication.repositories;

import com.example.spring_aplication.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
