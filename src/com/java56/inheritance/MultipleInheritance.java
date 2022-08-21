package com.java56.inheritance;
class Vehicle{
    public String color;
}
class Car extends Vehicle{
    public void run(){
        System.out.println("Car is running safely.");
    }
}
class ToyotaCar extends Car{
    String model;
}
public class MultipleInheritance {
    public static void main(String[] args) {
        ToyotaCar toyota=new ToyotaCar();
        toyota.color="Silver";
        toyota.model="Toyota Prado";

        System.out.println("Car Model: "+toyota.model);
        System.out.println("Car Color: "+toyota.color);
        toyota.run();
    }
}
