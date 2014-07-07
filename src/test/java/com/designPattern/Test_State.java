package com.designPattern;

import com.designPattern.behavioral.state.ContextMachine;
import com.designPattern.behavioral.state.StartState;

public class Test_State
{

    public static void main(String[] args)
    {

        ContextMachine context = new ContextMachine();

        context.setState(new StartState());

        while (context.getState() != null)
        {
            context.getState().handle(context);
        }

    }

}
