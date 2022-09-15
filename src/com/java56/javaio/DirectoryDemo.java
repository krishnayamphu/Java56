package com.java56.javaio;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        File file=new File("photos");
        if(file.mkdir()){
            System.out.println("Directory created successfully.");
        }else{
            System.out.println("Directory can't created.");
        }
    }
}
