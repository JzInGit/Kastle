package com.designPattern.creational.factoryMethod;

public class CarFactory_Multi
{
    public ICar createAudi()
    {
        return new Audi();
    }

    public ICar createVolkswagen()
    {
        return new Volkswagen();
    }
}
