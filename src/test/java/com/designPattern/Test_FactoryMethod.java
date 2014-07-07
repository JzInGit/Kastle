package com.designPattern;

import com.designPattern.creational.factoryMethod.CarFactory_Static;
import com.designPattern.creational.factoryMethod.ICar;

public class Test_FactoryMethod
{

    public static void main(String[] args)
    {

        // CarFactory_Simple factory = new CarFactory_Simple();
        // ICar audi = factory.createCar("audi");
        // ICar volkswagen = factory.createCar("volkswagen");

        // CarFactory_Multi factory = new CarFactory_Multi();
        // ICar audi = factory.createAudi();
        // ICar volkswagen = factory.createVolkswagen();

        ICar audi = CarFactory_Static.createAudi();
        ICar volkswagen = CarFactory_Static.createVolkswagen();

        audi.run();
        volkswagen.run();
    }

}
