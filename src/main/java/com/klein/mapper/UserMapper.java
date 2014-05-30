package com.klein.mapper;

import com.klein.entity.User;

public interface UserMapper
{
    void insertUser(User user);

    void updateUser(User user);

    User getUser(User user);

    User getUserByName(String username);
}
