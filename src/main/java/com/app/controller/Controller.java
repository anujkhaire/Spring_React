package com.app.controller;

import com.app.dao.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class Controller {

    private final UserService userService;
    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/")
    public String get(){
        return "ant on the screen";
    }
    @RequestMapping("/name")
    public User name(){
        return userService.getUserByName("anuj");
    }
    @RequestMapping("/user")
    public List<User> users(){
        return userService.getUser();
    }
    @RequestMapping("/upi")
    public User upi(){
        return userService.getUserByUpi("434343@upi");
    }

}
