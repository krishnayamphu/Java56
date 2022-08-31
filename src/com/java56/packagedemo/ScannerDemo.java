package com.java56.packagedemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=scanner.nextInt();

        System.out.println("Your age is : "+age);

    }
}
