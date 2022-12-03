package com.example.spring_aplication.controllers;

import com.example.spring_aplication.entities.User;
import com.example.spring_aplication.entities.UserContainer;
import com.example.spring_aplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User> getAllUsers(@PathParam("name") String name){
        return userRepository.getAllByUsername(name);
    }

    @PostMapping()
    public void createUser(@RequestBody List<User> user){
        userRepository.saveAll(user);
    }

//    @PostMapping("/{id}")
//    public UserContainer testPost(@RequestBody User user,@PathVariable("id") int id,@RequestParam int serialNumber){
//        final UserContainer userContainer = new UserContainer();
//        userContainer.setUser(user);
//        userContainer.setId(id);
//        userContainer.setSerialNumber(serialNumber);
//        return userContainer;
}
