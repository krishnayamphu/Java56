package com.java56.oop;
class Fruit{
    public void taste(){
        System.out.println("testing fruit taste");
    }
}
public class Mango extends Fruit{
    public void demo(){
        System.out.println("demo method from mango");
    }

    public void run(){
        taste();
        this.demo();
    }

    public static void main(String[] args) {
        Mango mango=new Mango();
        mango.run();
    }
}
