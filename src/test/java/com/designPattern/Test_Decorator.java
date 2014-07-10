package com.designPattern;

import com.designPattern.structural.decorator.DecoratorAt;
import com.designPattern.structural.decorator.Source;

public class Test_Decorator
{

    public static void main(String[] args)
    {
        Source source = new Source();
        DecoratorAt decorator = new DecoratorAt(source);
        decorator.method();
    }

}
