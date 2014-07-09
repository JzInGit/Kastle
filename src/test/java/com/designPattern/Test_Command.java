package com.designPattern;

import com.designPattern.behavioral.command.CreateCommand;
import com.designPattern.behavioral.command.ICommand;
import com.designPattern.behavioral.command.Invoker;
import com.designPattern.behavioral.command.Receiver;

public class Test_Command
{
    public static void main(String[] args)
    {
        Receiver receiver = new Receiver();
        ICommand command = new CreateCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.runCommand();
        invoker.undoCommand();
    }
}
