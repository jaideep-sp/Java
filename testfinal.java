package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class testfinal {
       static int rows;
       static int cols;

    public static void main(String[] args) throws IOException {

        //File newfiFile = new File("/Users/jaideep/java/demo/src/data/test.txt");
        FileWriter writer = new FileWriter("test.txt");
       
      

        String filepath="/Users/jaideep/java/demo/src/data/jtc.xlsx";
        String sheetname="Sheet1";
        utils cell = new utils(filepath, sheetname);
        
       
        // cell.getcell(1, 2);
        // cell.getcell(1, 3);

        //System.out.println(s);

        rows= cell.getRowcount();
        cols= cell.getcols();
        //writer.write("sadada"); 
        //writer.close();

        for(int r=0; r<rows; r++){
            
            for(int c=0; c<cols; c++){
                
                Object s= cell.getcell(r, c);
                
                writer.write(s.toString()+" ");
                               
            }
            writer.write("\n");
        }
        writer.close();
        
    }
}
