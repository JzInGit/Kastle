package com.designPattern.behavioral.visitor;

public class Store implements Visitable
{

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

}
