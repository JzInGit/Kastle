package com.designPattern.creational.factoryMethod;

import com.designPattern.creational.factoryMethod.PhoneCreater;

public class NokiaCreater implements PhoneCreater
{

    @Override
    public void createAPhone()
    {
        System.out.println("I'm a Nokia.");
    }

}
