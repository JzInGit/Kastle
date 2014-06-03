package com.klein.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.klein.dao.IUserDao;
import com.klein.entity.User;
import com.klein.service.IUserService;

@Service
public class UserService implements IUserService
{

    @Resource
    private IUserDao userDao;

    @Override
    public User getUserByName(String username)
    {
        User user = userDao.getUserByName(username);
        return user;
    }

}
