package com.example;


import java.io.FileWriter;
import java.io.IOException;

class appe{
    public static void main(String[] args) throws IOException {
        FileWriter wr =new FileWriter("appe.txt",true);
            Object s=53;

       for (int j=0; j<5; j++){
        for(int i=0; i<5;i++){
            wr.write(s.toString());
           }
       } 
       
        wr.close();
    }
}