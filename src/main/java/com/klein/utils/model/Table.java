package com.klein.utils.model;

import java.util.HashMap;

public class Table
{

    private String tableName;
    private HashMap<String, String> columns;

    public String getTableName()
    {
        return tableName;
    }

    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    public HashMap<String, String> getColumns()
    {
        return columns;
    }

    public void setColumns(HashMap<String, String> columns)
    {
        this.columns = columns;
    }

    public void addColumn(String columnName, String columnType)
    {
        columns.put(columnName, columnType);
    }

}
