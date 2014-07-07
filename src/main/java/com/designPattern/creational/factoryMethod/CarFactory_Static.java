package com.designPattern.creational.factoryMethod;

public class CarFactory_Static
{
    public static ICar createAudi()
    {
        return new Audi();
    }

    public static ICar createVolkswagen()
    {
        return new Volkswagen();
    }
}
