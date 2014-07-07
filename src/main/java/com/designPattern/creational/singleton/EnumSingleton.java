package com.designPattern.creational.singleton;

public enum EnumSingleton
{
    INSTANCE;

    EnumSingleton()
    {
        System.out.println("I'm instantiating myself.");
    }

    public void getInstanceInfo()
    {
        System.out.println("I'm an instance.");
    }
}
