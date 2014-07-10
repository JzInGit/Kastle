package com.designPattern.creational.builder;

public class FatSnowmanBuilder implements ISnowmanBuilder
{

    Snowman snowman = null;

    public FatSnowmanBuilder()
    {
        this.snowman = new Snowman();
    }

    @Override
    public void buildBody()
    {
        snowman.setBody("Fat Body builded.");
    }

    @Override
    public void buildHead()
    {
        snowman.setHead("Fat Head builded.");
    }

    @Override
    public void buildLeg()
    {
        snowman.setLeg("Fat Leg builded.");
    }

    @Override
    public void buildHand()
    {
        snowman.setHand("Fat Hand builded.");
    }

    @Override
    public Snowman getSnowman()
    {
        return snowman;
    }

}
