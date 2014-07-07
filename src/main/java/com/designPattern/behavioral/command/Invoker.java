package com.designPattern.behavioral.command;

public class Invoker
{

    private ICommand command;

    public ICommand getCommand()
    {
        return command;
    }

    public void setCommand(ICommand command)
    {
        this.command = command;
    }

    public void runCommand()
    {
        command.execute();
    }

    public void undoCommand()
    {
        command.undo();
    }
}
