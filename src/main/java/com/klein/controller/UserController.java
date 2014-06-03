package com.klein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klein.entity.User;
import com.klein.service.IUserService;

@Controller
@RequestMapping("/userLogin")
public class UserController
{

    @Autowired(required = true)
    private IUserService userService;

    @RequestMapping("/vaildation")
    public String userLogin(String username, String password)
    {
        User user = userService.getUserByName("owen");
        System.out.println("Hi, my name is " + user.getUsername());
        System.out.println("Hi, my password is " + user.getPassword());
        return null;
    }
}
