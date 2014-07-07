package com.designPattern.behavioral.state;

public class PublishState implements State
{

    @Override
    public void handle(ContextMachine machine)
    {
        System.out.println("Publish...");
        machine.setState(new CompleteState());
    }

}
