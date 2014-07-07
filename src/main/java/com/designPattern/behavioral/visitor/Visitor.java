package com.designPattern.behavioral.visitor;

public interface Visitor
{
    void visit(Store store);

    void visit(Market market);

    void visit(Government government);
}
