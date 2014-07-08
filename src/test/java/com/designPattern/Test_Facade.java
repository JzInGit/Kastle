package com.designPattern;

import com.designPattern.structural.facade.Boot;

public class Test_Facade
{

    public static void main(String[] args)
    {
        Boot boot = new Boot();

        boot.startup();

        boot.shutdown();

    }

}
