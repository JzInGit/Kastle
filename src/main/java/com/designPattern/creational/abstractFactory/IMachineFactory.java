package com.designPattern.creational.abstractFactory;

public interface IMachineFactory
{
    ICar createCar();

    ITank createTank();
}
