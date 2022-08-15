package com.java56.basic;

import java.util.Scanner;

public class JavaInputUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Name:" + name);

        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("value of n: " + n);
    }
}
