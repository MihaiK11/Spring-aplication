package com.example.spring_aplication.repositories;

import com.example.spring_aplication.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository  extends JpaRepository<Store, Long> {
}
