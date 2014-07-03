package com.designPattern.test;

import com.designPattern.singleton.Singleton;

public class TestSingleton
{
    public static void main(String[] args)
    {
        Singleton i = Singleton.getInstance();
        Singleton j = Singleton.getInstance();
        System.out.println(i == j);
    }
}
