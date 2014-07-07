package com.designPattern;

import com.designPattern.behavioral.observer.Policeman;
import com.designPattern.behavioral.observer.Suspect;


public class Test_Observer
{

    public static void main(String[] args)
    {
        Suspect suspect = new Suspect();
        Policeman policeman = new Policeman();
        suspect.addObserver(policeman);
        suspect.setStatus("run");
    }

}
