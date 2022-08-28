package com.java56.inheritance;
class Shape{
    void draw(){
        System.out.println("drawing shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
public class DrawingApp {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
    }
}
