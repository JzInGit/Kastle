package com.designPattern.factoryMethod.impl;

import com.designPattern.factoryMethod.PhoneCreater;

public class NokiaCreater implements PhoneCreater
{

    @Override
    public void createAPhone()
    {
        System.out.println("I'm a Nokia.");
    }

}
