package com.designPattern.creational.abstractFactory;

public class RenaultFT implements ITank
{
    @Override
    public void move()
    {
        System.out.println("The Renault FT is moving slowly...");
    }
}
