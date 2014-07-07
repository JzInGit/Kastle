package com.designPattern.behavioral.state;

public class DraftState implements State
{

    @Override
    public void handle(ContextMachine machine)
    {
        System.out.println("Draft...");
        machine.setState(new PublishState());
    }

}
