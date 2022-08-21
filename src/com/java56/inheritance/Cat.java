package com.java56.inheritance;
class Animal{
    public String color;
    public void eat(){
        System.out.println("Eating some food");
    }
}
public class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.color="White";

        System.out.println("Cat color: "+cat.color);
        System.out.print("Cat ");
        cat.eat();
    }
}
