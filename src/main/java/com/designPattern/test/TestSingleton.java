package com.designPattern.test;

import com.designPattern.singleton.EnumSingleton;

public class TestSingleton
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
