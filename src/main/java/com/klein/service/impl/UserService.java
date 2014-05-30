package com.klein.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.klein.entity.User;
import com.klein.mapper.UserMapper;
import com.klein.service.IUserService;

@Service("userService")
public class UserService implements IUserService
{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username)
    {
        User user = userMapper.getUserByName(username);
        return user;
    }

}
