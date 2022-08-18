package com.java56.oop;

public class Apple {
    String color;
    public void taste(){ //general method
        System.out.println("Apple taste is very sweet");
    }

    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.color="Red";
        System.out.println("Apple color: "+apple.color);

        Apple apple1=new Apple();
        apple1.color="Green";
        System.out.println("Apple color: "+apple1.color);
        apple1.taste();
    }
}
