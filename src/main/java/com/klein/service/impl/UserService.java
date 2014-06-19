package com.klein.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klein.entity.User;
import com.klein.mapper.UserMapper;
import com.klein.service.IUserService;

@Service
public class UserService implements IUserService
{

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User getUserByName(String username)
    {
        User user = userMapper.getUserByName(username);
        return user;
    }

    @Transactional
    public void addUser(User user)
    {
        userMapper.addUser(user);
    }

}
