package com.example.users.controller;

import com.example.users.model.ontoone.MyUser;
import com.example.users.pojo.UserPojo;
import com.example.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class UsersController {


    private  UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("user")
    public ResponseEntity getUsers(){
        return ResponseEntity.status(200).body(userService.getUsers());
    }

    @GetMapping("user/{email}")
    public ResponseEntity getUserByEmail(@PathVariable String email){
        return ResponseEntity.status(200).body(userService.getUserByEmail(email));
    }





    @PostMapping("user")
    public ResponseEntity addUser(@RequestBody UserPojo userPojo){
        userService.addUser(userPojo);
        return ResponseEntity.status(201).body("User added !");
    }


    @DeleteMapping("user/{id}")
    public ResponseEntity deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity.status(200).body("User deleted !");
    }

}
