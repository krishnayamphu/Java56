package com.java56.abstraction;

public class Circle extends Shape{
    public Circle(String shape){
        super(shape);
    }
    public void draw(){
        System.out.println("drawing circle shape");
    }

    @Override
    void paint() {
        System.out.println("painting with red color");
    }
}
