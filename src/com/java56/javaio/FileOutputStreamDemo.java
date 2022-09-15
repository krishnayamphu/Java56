package com.java56.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream stream=new FileOutputStream("doc.txt");
            String s="welcome to java io";
//            stream.write(97);
            stream.write(s.getBytes());
            stream.flush();
            stream.close();
            System.out.println("data write successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
