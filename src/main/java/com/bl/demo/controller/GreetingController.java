package com.bl.demo.controller;

import com.bl.demo.model.User;
import com.bl.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    IUserService userService;

    @GetMapping("/display")
    public List<User> displayUSer(){
        return userService.displayUser();
    }


}
