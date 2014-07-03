package com.designPattern.factoryMethod.impl;

import com.designPattern.factoryMethod.PhoneCreater;

public class AppleCreate implements PhoneCreater
{

    @Override
    public void createAPhone()
    {
        System.out.println("I'm a iPhone.");
    }

}
