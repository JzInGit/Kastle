package com.designPattern.creational.builder;

public interface ISnowmanBuilder
{
    void buildBody();

    void buildHead();

    void buildLeg();

    void buildHand();

    Snowman getSnowman();
}
