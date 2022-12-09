package com.example.spring_aplication.controllers;

import com.example.spring_aplication.entities.Product;
import com.example.spring_aplication.entities.Store;
import com.example.spring_aplication.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    @PostMapping
    public Product create(@RequestBody Product product){
        return repository.save(product);
    }


    @GetMapping
    public List<Product> getAll(){
        return repository.findAll();
    }
}
