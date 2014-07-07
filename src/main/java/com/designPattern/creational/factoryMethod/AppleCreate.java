package com.designPattern.creational.factoryMethod;

import com.designPattern.creational.factoryMethod.PhoneCreater;

public class AppleCreate implements PhoneCreater
{

    @Override
    public void createAPhone()
    {
        System.out.println("I'm a iPhone.");
    }

}
