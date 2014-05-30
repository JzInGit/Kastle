package com.klein.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klein.mapper.UserMapper;
import com.klein.service.IUserService;

@Service
public class UserService implements IUserService
{

    @Autowired
    private UserMapper userMapper;
    
}
