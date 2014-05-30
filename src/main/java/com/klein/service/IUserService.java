package com.klein.service;

import org.springframework.stereotype.Service;

import com.klein.entity.User;

public interface IUserService
{

    User getUserByName(String username);

}
