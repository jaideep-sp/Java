package com.example;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class utils {

   static XSSFWorkbook workbook;
   static XSSFSheet sheet;

    public utils(String filepath, String sheetname) throws IOException{
        
            workbook = new XSSFWorkbook(filepath);
             //sheet = workbook.getSheetAt(0);
            sheet = workbook.getSheet(sheetname);  
    }

    public Object getcell(int rnum, int cnum) throws IOException {
      
            DataFormatter formatter = new DataFormatter();
            Object val = formatter.formatCellValue(sheet.getRow(rnum).getCell(cnum));
            return val;
            //String val = sheet.getRow(1).getCell(0).getStringCellValue();
            // System.out.println(val);     
    }
    public  int getRowcount() throws IOException {
      
            int row= sheet.getPhysicalNumberOfRows();
            return row;
            // System.out.println("rows "+row);    
    }
    public int getcols(){
            int col= sheet.getRow(1).getLastCellNum();
            return col;
            //System.out.println("col= "+col);
    }
}
