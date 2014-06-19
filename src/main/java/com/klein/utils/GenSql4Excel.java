package com.klein.utils;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenSql4Excel
{

    private static int TABLENAME_INDEX = 0;
    private static int COLNAME_INDEX = 0;
    private static int COLTYPE_INDEX = 0;

    private static Map<String, List<String>> tables = new HashMap<String, List<String>>();
    private static List<String> tableNames = new ArrayList<String>();

    public static void main(String[] args)
    {
        try
        {
            Workbook wb = WorkbookFactory.create(new File("D:/xpads.xlsx"));    //  Input file location
            Sheet sheet = wb.getSheetAt(1);

            for (Cell cell : sheet.getRow(0))
            {
                if ("表名".equals(cell.getStringCellValue()))
                {
                    TABLENAME_INDEX = cell.getColumnIndex();
                }
                if ("字段名".equals(cell.getStringCellValue()))
                {
                    COLNAME_INDEX = cell.getColumnIndex();
                }
                if ("类型".equals(cell.getStringCellValue()))
                {
                    COLTYPE_INDEX = cell.getColumnIndex();
                }
            }

            for (int i = 1; i <= sheet.getLastRowNum(); i++)
            {
                Row row = sheet.getRow(i);
                String tableNameTemp = row.getCell(TABLENAME_INDEX).getStringCellValue();
                if (!tableNames.isEmpty() && tableNames.contains(tableNameTemp))
                {
                    tables.get(tableNameTemp).add(
                            row.getCell(COLNAME_INDEX).getStringCellValue().replace(" ", "")
                                    + " "
                                    + row.getCell(COLTYPE_INDEX).getStringCellValue()
                                            .replace(" ", ""));
                }
                else
                {
                    List<String> columns = new ArrayList<String>();
                    columns.add(row.getCell(COLNAME_INDEX).getStringCellValue().replace(" ", "")
                            + " "
                            + row.getCell(COLTYPE_INDEX).getStringCellValue().replace(" ", ""));
                    tables.put(tableNameTemp, columns);
                    tableNames.add(tableNameTemp);
                }

            }

            File sqlScript = new File("D:/ITG.sql");   //  Output file name
            FileWriter fw = new FileWriter(sqlScript);

            for (Map.Entry<String, List<String>> entry : tables.entrySet())
            {
                fw.write("--  Table " + entry.getKey() + " columns total: "
                        + entry.getValue().size() + ", name length: " + entry.getKey().length() + "\n");
                fw.write("Create table " + entry.getKey().replace(" ", "") + "\n(\n");    //  table info
                for (int i = 0; i < entry.getValue().size(); i++)
                {
                    fw.write("  " + entry.getValue().get(i) + ",\n");
                }
                fw.write("  DATA_DATE TIMESTAMP\n);\n");
            }
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Failed to create workbook.");
        }

    }
}
