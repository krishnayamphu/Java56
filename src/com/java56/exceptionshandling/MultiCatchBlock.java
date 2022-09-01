package com.java56.exceptionshandling;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            int[] num=new int[2];
            System.out.println(20/0);
            num[0]=10;
            num[1]=20;
            System.out.println(num[1]);
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("hello");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex);
        }

    }
}
