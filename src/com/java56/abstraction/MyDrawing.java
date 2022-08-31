package com.java56.abstraction;

public class MyDrawing implements Printable,Paintable{
    @Override
    public void print() {
        System.out.println("printing drawing");
    }



    @Override
    public void paint() {
        System.out.println("painting drawing with nice color");
    }

    public static void main(String[] args) {
        MyDrawing ob=new MyDrawing();
        ob.paint();
        ob.print();

    }
}
