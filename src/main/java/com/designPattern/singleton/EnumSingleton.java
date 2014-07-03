package com.designPattern.singleton;

public enum EnumSingleton
{
    INSTANCE;

    EnumSingleton()
    {
        System.out.println("I'm instantiate myself.");
    }

    public void getInstanceInfo()
    {
        System.out.println("I'm an instance.");
    }
}
