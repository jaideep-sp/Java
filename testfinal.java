package com.example;


import java.io.FileWriter;
import java.io.IOException;

import com.check;

public class testfinal {
       static int rows;
       static int cols;
       static boolean c;
    public static void main(String[] args) throws IOException {

     
         check bCheck= new check();
        
        
       

       FileWriter writer = new FileWriter("testxls.txt",true);

        String filepath="<FileDir>/student.xls";
        String sheetname="Sheet1";
        
        c=bCheck.filecheck(filepath);

        if(c==false){
            xlsx cell = new xlsx(filepath, sheetname);
            rows= cell.getRowcount();
            cols= cell.getcols();
            
            for(int r=0; r<rows; r++){
                
                for(int c=0; c<cols; c++){
                    
                    Object s= cell.getcell(r, c);
                    
                    writer.write(s.toString()+" ");
                                   
                }
                writer.write("\n");
            }
            writer.close();
    
        }
        else{
            xls cell = new xls(filepath, sheetname);
            rows= cell.getRowcount();
            cols= cell.getcols();
            
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
}
