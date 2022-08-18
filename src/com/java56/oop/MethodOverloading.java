package com.java56.oop;

public class MethodOverloading {
    public void test(){
        System.out.println("Default test method");
    }
    public void test(String testname){
        System.out.println("Testing "+testname);
    }
    public void sum(double x, double y){
        System.out.println("Total: "+(x+y));
    }
    public void sum(int a, int b){
        System.out.println("Total sum: "+(a+b));
    }


    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.test("test1");
        ob.sum(5.5,6);
    }
}
