package com.klein.service;

import com.klein.entity.User;

public interface IUserService
{

    User getUserByName(String username);

    void addUser(User user);

}
