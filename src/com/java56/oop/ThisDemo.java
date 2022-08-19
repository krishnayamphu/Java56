package com.java56.oop;
public class ThisDemo {
    int x;
    public void test(int x){
        this.x=x; //
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.test(5);
        System.out.println(t.x);
    }
}
