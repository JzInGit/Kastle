package com.designPattern;

import com.designPattern.behavioral.mediator.America;
import com.designPattern.behavioral.mediator.Irag;
import com.designPattern.behavioral.mediator.UnitedNations;

public class Test_Mediator
{

    public static void main(String[] args)
    {
        UnitedNations nations = new UnitedNations();
        America america = new America(nations);
        Irag irag = new Irag(nations);

        nations.setAmerica(america);
        nations.setIrag(irag);

        america.declare("不准研制核武器，否则要发动战争");
        irag.declare("我们没有核武器，也不怕侵略");
    }

}
