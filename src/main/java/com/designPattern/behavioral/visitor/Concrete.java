package com.designPattern.behavioral.visitor;

public class Concrete implements Visitor
{

    @Override
    public void visit(Store store)
    {
        System.out.println("Buy something from store.");
    }

    @Override
    public void visit(Market market)
    {
        System.out.println("Buy something from market.");
    }

    @Override
    public void visit(Government government)
    {
        System.out.println("Cannot shopping here.");
    }

}
