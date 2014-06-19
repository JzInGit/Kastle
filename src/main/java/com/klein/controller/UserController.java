package com.klein.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.klein.entity.User;
import com.klein.exception.OKUtilException;
import com.klein.service.IUserService;
import com.klein.utils.CipherUtil;

@Controller
@RequestMapping("/user")
public class UserController
{

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register",
                    method = RequestMethod.POST)
    public String userRegister(String username, String password)
    {
        logger.info("Username is " + username + " and password is " + password);
        String ciphertext = null;
        try
        {
            ciphertext = CipherUtil.generatePwd(password);
        }
        catch (OKUtilException e)
        {
            return "";
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(ciphertext);
        userService.addUser(user);

        return "home";
    }

    @RequestMapping(value = "/login",
                    method = RequestMethod.POST)
    public String userLogin(@RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password, HttpServletRequest request)
    {
        User user = userService.getUserByName(username);
        boolean valid = false;
        try
        {
            valid = CipherUtil.validatePwd(user.getPassword(), password);
        }
        catch (OKUtilException e)
        {
            return "";
        }
        if (valid)
        {
            return "redirect:/user/logined";
        }
        return "home";
    }
}
