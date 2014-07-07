package com.designPattern.behavioral.mediator;

public class America extends CountryAt
{

    public America(MediatorAt mediator)
    {
        super(mediator);
    }

    public void declare(String message)
    {
        mediator.declare(message, this);
    }

    public void getMessage(String message)
    {
        System.out.println("������öԷ���Ϣ:" + message);
    }
}
