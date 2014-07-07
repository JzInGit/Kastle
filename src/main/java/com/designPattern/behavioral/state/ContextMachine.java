package com.designPattern.behavioral.state;

public class ContextMachine
{
    private State state;

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

}
