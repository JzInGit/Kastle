package com.designPattern;

import com.designPattern.behavioral.visitor.Concrete;
import com.designPattern.behavioral.visitor.Government;
import com.designPattern.behavioral.visitor.Market;
import com.designPattern.behavioral.visitor.Store;

public class Test_Visitor
{
    public static void main(String[] args)
    {
        Store store = new Store();
        Market market = new Market();
        Government government = new Government();
        Concrete concrete = new Concrete();
        store.accept(concrete);
        market.accept(concrete);
        government.accept(concrete);
    }
}
