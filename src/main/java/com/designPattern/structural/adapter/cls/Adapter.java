package com.designPattern.structural.adapter.cls;

public class Adapter extends Source implements ITargetable
{

    @Override
    public void newMethod()
    {
        System.out.println("This is the latest method.");
    }

}
