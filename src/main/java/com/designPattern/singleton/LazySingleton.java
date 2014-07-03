package com.designPattern.singleton;

public class LazySingleton
{
    private static LazySingleton instance = null;

    private LazySingleton()
    {
        System.out.println("Instantiate the Lazy-singleton.");
    }

    public static synchronized LazySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
