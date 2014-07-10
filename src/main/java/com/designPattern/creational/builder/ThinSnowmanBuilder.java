package com.designPattern.creational.builder;

public class ThinSnowmanBuilder implements ISnowmanBuilder
{

    Snowman snowman = null;

    public ThinSnowmanBuilder()
    {
        this.snowman = new Snowman();
    }

    @Override
    public void buildBody()
    {
        snowman.setBody("Thin Body builded.");
    }

    @Override
    public void buildHead()
    {
        snowman.setHead("Thin Head builded.");
    }

    @Override
    public void buildLeg()
    {
        snowman.setLeg("Thin Leg builded.");
    }

    @Override
    public void buildHand()
    {
        snowman.setHand("Thin Hand builded.");
    }

    @Override
    public Snowman getSnowman()
    {
        return snowman;
    }

}
