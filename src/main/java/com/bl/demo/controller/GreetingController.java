package com.bl.demo.controller;

import com.bl.demo.dto.UserDto;
import com.bl.demo.model.User;
import com.bl.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    IUserService userService;

    @GetMapping("/display")
    public List<User> displayUSer(){
        return userService.displayUser();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody UserDto user){
        System.out.println("hello "+user.firstName);
        return userService.addUser(user);
    }
    @PutMapping("/update/{id}")
    public User addUser(@PathVariable(name = "id") Integer id, @RequestBody UserDto user) {
        return userService.updateUser(id, user);
    }
}
