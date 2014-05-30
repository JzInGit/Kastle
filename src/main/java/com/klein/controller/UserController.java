package com.klein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.klein.service.IUserService;

@Controller
public class UserController
{

    @Autowired
    private IUserService userService;
}
