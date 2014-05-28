package com.klein.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klein.base.BaseDAO;
import com.klein.module.service.IUserService;

@Service
public class UserService implements IUserService
{

    @Autowired
    private BaseDAO baseDAO;
}
