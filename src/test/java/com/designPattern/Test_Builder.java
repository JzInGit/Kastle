package com.designPattern;

import com.designPattern.creational.builder.Director;
import com.designPattern.creational.builder.FatSnowmanBuilder;
import com.designPattern.creational.builder.Snowman;

public class Test_Builder
{

    public static void main(String[] args)
    {
        Director director = new Director();
        Snowman snowman = director.buildSnowman(new FatSnowmanBuilder());

        System.out.println(snowman.getBody());
        System.out.println(snowman.getHand());
        System.out.println(snowman.getHead());
        System.out.println(snowman.getLeg());
    }

}
