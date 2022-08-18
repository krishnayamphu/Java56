package com.java56.oop;

public class Person {
    public Person(){
        System.out.println("Default constructor");
    }
    public Person(String name){
        System.out.println("Person name: "+name);
    }

    public static void main(String[] args) {
        Person p=new Person("Ram");
    }
}
