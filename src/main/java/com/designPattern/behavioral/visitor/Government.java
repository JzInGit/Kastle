package com.designPattern.behavioral.visitor;

public class Government implements Visitable
{

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

}
