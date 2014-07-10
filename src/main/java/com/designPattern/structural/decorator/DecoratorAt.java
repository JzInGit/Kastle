package com.designPattern.structural.decorator;

public abstract class DecoratorAt implements IDecorator
{

    private Source source;

    public DecoratorAt(Source source)
    {
        this.source = source;
    }

    @Override
    public void method()
    {
        source.method();
    }

}
