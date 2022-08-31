package com.java56.abstraction;


public class Drawing {
    public static void main(String[] args) {
        Circle circle=new Circle("Circle");
        circle.draw();
        circle.test();
        circle.paint();

        System.out.println("===========");
        Shape shape=new Circle("Shape");
        shape.test();
    }
}
