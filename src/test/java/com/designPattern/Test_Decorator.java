package com.designPattern;

import com.designPattern.structural.decorator.ConcreteDecorator;
import com.designPattern.structural.decorator.Source;

public class Test_Decorator
{

    public static void main(String[] args)
    {
        Source source = new Source();
        ConcreteDecorator decorator = new ConcreteDecorator(source);
        decorator.method();
    }

}
