package com.designPattern;

import com.designPattern.structural.adapter.itf.ConcreteAdapterA;
import com.designPattern.structural.adapter.itf.ConcreteAdapterB;

public class Test_AdapterItf
{

    public static void main(String[] args)
    {
        ConcreteAdapterA ca = new ConcreteAdapterA();
        ConcreteAdapterB cb = new ConcreteAdapterB();

        ca.methodA();
        ca.methodB();
        cb.methodA();
        cb.methodB();

    }

}
