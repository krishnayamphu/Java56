package com.java56.oop;

public class Bike {
    private int maxSpeed=180;
    public Bike(){
        System.out.println("Bike is starting");
    }
    public Bike(String name){
        this();
        System.out.println(name+" bike is running smoothly");
    }

    public void getBike(Bike bike){
        System.out.println("Max speed:"+bike.maxSpeed);
    }

    public void run(){
        getBike(this);
    }

    public static void main(String[] args) {
        new Bike("Honad").run();
    }
}
