package com.designPattern.creational.factoryMethod;

public class CarFactory_Simple
{
    public ICar createCar(String carBrand)
    {
        if ("audi".equalsIgnoreCase(carBrand))
        {
            return new Audi();
        }
        else if ("volkswagen".equalsIgnoreCase(carBrand))
        {
            return new Volkswagen();
        }
        return null;
    }
}
