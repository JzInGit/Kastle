package com.designPattern.structural.adapter.itf;

public abstract class AdapterAt implements Sourceable
{

    @Override
    public void methodA()
    {
        System.out.println("Original methodA");
    }

    @Override
    public void methodB()
    {
        System.out.println("Original methodB");
    }

}
