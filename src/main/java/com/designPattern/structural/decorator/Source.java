package com.designPattern.structural.decorator;

public class Source implements IDecorator
{

    @Override
    public void method()
    {
        System.out.println("Processing...");
    }

}
