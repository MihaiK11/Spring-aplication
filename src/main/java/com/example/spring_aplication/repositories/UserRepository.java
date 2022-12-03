package com.example.spring_aplication.repositories;

import com.example.spring_aplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> getAllByUsername(final String username);

    User getFirstByUsername(final String username);
}
