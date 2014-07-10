package com.designPattern.creational.builder;

public class Director
{
    public Snowman buildSnowman(ISnowmanBuilder builder)
    {
        builder.buildBody();
        builder.buildHand();
        builder.buildHead();
        builder.buildLeg();

        return builder.getSnowman();
    }
}
