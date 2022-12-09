package com.example.spring_aplication.controllers;

import com.example.spring_aplication.entities.Store;
import com.example.spring_aplication.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreRepository repository;

    @PostMapping
    public Store create(@RequestBody final Store store){
//        this.store = store;
        return repository.save(store);
    }

    @GetMapping
    public List<Store> getAll(){
        return repository.findAll();
    }
}
