package com.designPattern;

import com.designPattern.creational.factoryMethod.AppleCreate;

public class MainTest
{

    public static void main(String[] args)
    {
        AppleCreate appleCreate = new AppleCreate();
        appleCreate.createAPhone();
    }

}
