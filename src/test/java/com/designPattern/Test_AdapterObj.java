package com.designPattern;

import com.designPattern.structural.adapter.cls.Adapter;

public class Test_AdapterObj
{

    public static void main(String[] args)
    {
        Adapter adapter = new Adapter();

        adapter.method();
        adapter.newMethod();

    }

}
