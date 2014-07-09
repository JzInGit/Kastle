package com.unassigned;

public class TestEnum
{
    public static void main(String[] args)
    {
        System.out.println(getFruit(null));
    }

    public static String getFruit(Fruit fruit)
    {
        if (fruit == null)
        {
            return "Invalid input";
        }
        return fruit.toString();
    }
}
