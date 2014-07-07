package com.designPattern;

import com.designPattern.creational.abstractFactory.Factory;
import com.designPattern.creational.abstractFactory.ICar;
import com.designPattern.creational.abstractFactory.ITank;

public class Test_AbstractFactory
{

    // ���󹤳�ģʽ�ر��ʺ���������һ�ֲ�Ʒ�ṹ����Ʒ��Ϊ����ϵ�У���ÿ��ϵ���У�
    // ��Ʒ�Ĳ��ֶ�����ͬ�ģ���һ��ϵ����ĳ��λ�õĲ�Ʒ������һ��ϵ����һ����һ��
    // ��Ӧ�Ĳ�Ʒ�������Ĳ�Ʒ�ṹ�Ǵ��ڵģ��⼸��ϵ����ͬһλ�õĲ�Ʒ�����ǻ���ģ�
    // ��������Բ�ͬ�ͻ��Ľ��������ÿ���ͻ���ֻ����һ��

    public static void main(String[] args)
    {
        Factory factory = new Factory();
        ICar car = factory.createCar();
        ITank tank = factory.createTank();

        car.run();
        tank.move();

    }

}
