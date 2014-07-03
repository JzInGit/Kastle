package com.unassigned;

public enum Fruit
{
    APPLE(101, "China", "I'm a Chinese apple"), BANANA(102, "India", "I'm a Indian banana"), PEAR(
            103, "Australia", "I'm a Australian pear"), WATERMELON(104, "India",
            "I'm a Indian watermelon"), PINEAPPLE(105, "Taiwan", "I'm a Taiwan pineapple"), GRAPE(
            106, "Taiwan", "I'm a Taiwan grape");

    private int id;
    private String From;
    private String Msg;

    private Fruit(int id, String From, String Msg)
    {
        this.id = id;
        this.From = From;
        this.Msg = Msg;
    }

    public String getFruitInfo()
    {
        return Msg;
    }

    public String toString()
    {
        return Msg + ", My ID is " + id;
    }
}
