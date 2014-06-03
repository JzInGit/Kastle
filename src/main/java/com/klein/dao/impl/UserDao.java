package com.klein.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.klein.dao.IUserDao;
import com.klein.entity.User;
import com.klein.mapper.UserMapper;

@Repository("userDao")
public class UserDao implements IUserDao
{
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name)
    {
        User user = userMapper.getUserByName(name);
        return user;
    }

    @Override
    public void addUser(User user)
    {
        userMapper.addUser(user);

    }

}
