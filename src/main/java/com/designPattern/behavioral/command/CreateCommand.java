package com.designPattern.behavioral.command;

public class CreateCommand implements ICommand
{

    private Receiver receiver;

    public CreateCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute()
    {
        receiver.action();
    }

    @Override
    public void undo()
    {
        receiver.undo();
    }

}
