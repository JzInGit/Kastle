package com.klein.dao;

import com.klein.entity.User;

public interface IUserDao
{
    User getUserByName(String name);
}
