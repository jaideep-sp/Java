package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;


public class xls {

   static HSSFWorkbook workbook;
   static HSSFSheet sheet;

    public xls(String filepath, String sheetname) throws IOException{
        
            InputStream file = new FileInputStream(filepath);
            workbook = new HSSFWorkbook(new POIFSFileSystem(file));
            
            sheet = workbook.getSheet(sheetname);  
    }

    public Object getcell(int rnum, int cnum) throws IOException {
      
            DataFormatter formatter = new DataFormatter();
            Object val = formatter.formatCellValue(sheet.getRow(rnum).getCell(cnum));
            return val;
              
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
