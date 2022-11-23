package com.example.spring_aplication.controllers;

import com.example.spring_aplication.entities.User;
import com.example.spring_aplication.entities.UserContainer;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getAllUsers(){
        return "OK";
    }

    @PutMapping()
    public User createUser(@RequestBody User user){
        return user;
    }

    @PostMapping("/{id}")
    public UserContainer testPost(@RequestBody User user,@PathVariable("id") int id,@RequestParam int serialNumber){
        final UserContainer userContainer = new UserContainer();
        userContainer.setUser(user);
        userContainer.setId(id);
        userContainer.setSerialNumber(serialNumber);
        return userContainer;
    }
}
