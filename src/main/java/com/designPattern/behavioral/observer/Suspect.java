package com.designPattern.behavioral.observer;

import java.util.Observable;

public class Suspect extends Observable
{
    private String status;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
        setChanged();
        notifyObservers();
    }
}
