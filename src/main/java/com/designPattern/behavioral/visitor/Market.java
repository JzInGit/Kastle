package com.designPattern.behavioral.visitor;

public class Market implements Visitable
{

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

}
