package com.java56.exceptionshandling;

public class ThrowsDemo {
    public void calc() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        System.out.println(20/5);
        int[] n=new int[2];
        System.out.println(n[5]);
    }
    public static void main(String[] args) {
        ThrowsDemo td=new ThrowsDemo();
        try{
            td.calc();
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("you can't divide number by zero");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex);
        }

    }
}
