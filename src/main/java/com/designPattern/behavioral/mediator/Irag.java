package com.designPattern.behavioral.mediator;

public class Irag extends CountryAt
{

    public Irag(MediatorAt mediator)
    {
        super(mediator);
    }

    public void declare(String message)
    {
        mediator.declare(message, this);
    }

    public void getMessage(String message)
    {
        System.out.println("伊拉克获得对方信息:" + message);
    }
}
