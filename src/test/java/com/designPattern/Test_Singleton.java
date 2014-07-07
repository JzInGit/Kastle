package com.designPattern;

import com.designPattern.creational.singleton.EnumSingleton;


public class Test_Singleton
{
    public static void main(String[] args)
    {
        // LazySingleton i = LazySingleton.getInstance();
        // LazySingleton j = LazySingleton.getInstance();
        // System.out.println(i == j);
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.getInstanceInfo();
    }
}
