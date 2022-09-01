package com.java56.exceptionshandling;

public class TryCatch {
    public static void main(String[] args) {
        try{
            double x=15d, y=2;
            double ans=15/y;
            System.out.println("Ans: "+ans);
            System.out.println("You reached last");
        }catch (ArithmeticException e){
            System.err.println("you can't / number by zero");
            System.err.println(e);
        }

    }
}
