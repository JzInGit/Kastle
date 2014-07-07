package com.designPattern.behavioral.mediator;

public class UnitedNations extends MediatorAt
{

    private America america;
    private Irag irag;

    public void setAmerica(America america)
    {
        this.america = america;
    }

    public void setIrag(Irag irag)
    {
        this.irag = irag;
    }

    @Override
    void declare(String message, CountryAt country)
    {
        if (country == america)
        {
            irag.getMessage(message);
        }
        else if (country == irag)
        {
            america.getMessage(message);
        }

    }

}
