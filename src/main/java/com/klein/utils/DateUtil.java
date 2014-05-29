package com.klein.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil
{
    String formatString_24H = "yyyy-MM-dd HH:mm:ss";
    String formatString_12H = "yyyy-MM-dd hh:mm:ss b";

    static SimpleDateFormat DATEFORMAT = null;

    public static long getTimeInterval(Date date_1, Date date_2, long backType)
    {
        long l_date_1 = date_1.getTime();
        long l_date_2 = date_2.getTime();
        long interval = (l_date_2 - l_date_1) / backType;
        return interval;
    }

    public static void main(String[] args)
            throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2014-5-9");
        Date date2 = sdf.parse("2017-1-1");

        System.out.println(getTimeInterval(date1, date2, UtilConstant.BYDAY));

    }

}
