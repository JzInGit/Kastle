package com.designPattern;

import com.designPattern.structural.decorator.Decorator;
import com.designPattern.structural.decorator.Source;

public class Test_Decorator
{

    public static void main(String[] args)
    {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }

}
