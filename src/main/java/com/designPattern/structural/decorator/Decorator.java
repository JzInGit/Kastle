package com.designPattern.structural.decorator;

public class Decorator implements IDecorator
{

    private Source source;

    public Decorator(Source source)
    {
        this.source = source;
    }

    @Override
    public void method()
    {
        System.out.println("Before processing.");
        source.method();
        System.out.println("After processing.");
    }

}
