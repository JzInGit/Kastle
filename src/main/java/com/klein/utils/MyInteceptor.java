package com.klein.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.klein.entity.User;

public class MyInteceptor implements HandlerInterceptor
{

    private static Logger log = Logger.getLogger(MyInteceptor.class);

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object obj, Exception e)
            throws Exception
    {
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,
            ModelAndView view)
            throws Exception
    {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
            throws Exception
    {

        log.info("oh fuck!");

        User user = (User) request.getSession().getAttribute("loginUser");
        if (user != null)
        {
            return true;
        }
        response.sendRedirect("/user/index");
        return false;
    }

}
