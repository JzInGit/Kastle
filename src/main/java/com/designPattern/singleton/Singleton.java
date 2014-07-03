package com.designPattern.singleton;

public class Singleton
{
    private Singleton()
    {

    }

    /**
     * Lazy
     */
    // private static Singleton instance = null;
    //
    // public static synchronized Singleton getInstance()
    // {
    // if (instance == null)
    // {
    // instance = new Singleton();
    // }
    // return instance;
    // }

    /**
     * Eager
     */
    private static Singleton instance = new Singleton();

    public static Singleton getInstance()
    {
        return instance;
    }
}
