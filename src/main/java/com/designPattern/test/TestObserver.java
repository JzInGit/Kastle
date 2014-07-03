package com.designPattern.test;

import com.designPattern.observer.Policeman;
import com.designPattern.observer.Suspect;

public class TestObserver
{

    public static void main(String[] args)
    {
        Suspect suspect = new Suspect();
        Policeman policeman = new Policeman();
        suspect.addObserver(policeman);
        suspect.setStatus("run");
    }

}
