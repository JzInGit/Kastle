package com.designPattern.behavioral.mediator;

public abstract class CountryAt
{
    MediatorAt mediator;

    public CountryAt(MediatorAt mediator)
    {
        this.mediator = mediator;
    }
}
