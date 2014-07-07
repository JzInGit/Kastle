package com.designPattern.behavioral.state;

public class StartState implements State
{

    @Override
    public void handle(ContextMachine machine)
    {
        System.out.println("Start to process...");
        machine.setState(new DraftState());
    }

}
