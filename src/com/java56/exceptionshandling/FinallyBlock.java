package com.java56.exceptionshandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(20/5);
            System.out.println("Hello World");
        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("You've successfully reached finally block.");
        }
    }
}
