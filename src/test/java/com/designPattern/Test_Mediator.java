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

        america.declare("��׼���ƺ�����������Ҫ����ս��");
        irag.declare("����û�к�������Ҳ��������");
    }

}
