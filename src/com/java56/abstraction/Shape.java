package com.java56.abstraction;

public abstract class Shape {
    public Shape(String shape){
        System.out.println("Drawing "+shape);
    }
    void test(){
        System.out.println("testing");
    }

    abstract void paint(); //abstract method
}
