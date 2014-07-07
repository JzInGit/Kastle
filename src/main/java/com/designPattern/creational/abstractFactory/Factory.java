package com.designPattern.creational.abstractFactory;

public class Factory implements IMachineFactory
{

    @Override
    public ICar createCar()
    {
        return new Audi();
    }

    @Override
    public ITank createTank()
    {
        return new RenaultFT();
    }

}
