package com.designPattern.singleton;

public class EagerSingleton
{
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton()
    {
        System.out.println("Instantiate the Eager-singleton.");
    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }
}
