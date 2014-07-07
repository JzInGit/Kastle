package com.designPattern;

import com.designPattern.creational.abstractFactory.Factory;
import com.designPattern.creational.abstractFactory.ICar;
import com.designPattern.creational.abstractFactory.ITank;

public class Test_AbstractFactory
{

    // 抽象工厂模式特别适合于这样的一种产品结构：产品分为几个系列，在每个系列中，
    // 产品的布局都是相同的，在一个系列中某个位置的产品，在另一个系列中一定有一个
    // 对应的产品。这样的产品结构是存在的，这几个系列中同一位置的产品可能是互斥的，
    // 它们是针对不同客户的解决方案，每个客户都只择其一。

    public static void main(String[] args)
    {
        Factory factory = new Factory();
        ICar car = factory.createCar();
        ITank tank = factory.createTank();

        car.run();
        tank.move();

    }

}
