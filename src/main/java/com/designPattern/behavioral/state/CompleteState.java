package com.designPattern.behavioral.state;

public class CompleteState implements State
{

    @Override
    public void handle(ContextMachine machine)
    {
        System.out.println("Completed.");
        machine.setState(null);
    }

}
