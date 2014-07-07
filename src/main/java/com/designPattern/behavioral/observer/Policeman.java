package com.designPattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Policeman implements Observer
{

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("¿ªÊ¼×¥²¶......");
    }

}
