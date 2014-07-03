package com.klein.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExpTablesToExcel
{

    static String driver = "oracle.jdbc.driver.OracleDriver";

    static String url = "jdbc:oracle:thin:@192.168.10.132:1521:orcl";

    static String username = "funds62";

    static String password = "funds62";

    Connection connection = null;

    Statement statement = null;

    ResultSet resultSet = null;

    public static void connectToOracle()
            throws ClassNotFoundException
    {
        Class.forName(driver);
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
