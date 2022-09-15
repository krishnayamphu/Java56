package com.java56.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        try {
            File f=new File("aptech.txt");
            if(f.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("File can't create!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
