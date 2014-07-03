package com.designPattern.test;

import com.designPattern.factoryMethod.impl.AppleCreate;

public class MainTest
{

    public static void main(String[] args)
    {
        AppleCreate appleCreate = new AppleCreate();
        appleCreate.createAPhone();
    }

}
