package com.java56.inheritance;

public class InstantInitializerBlock {
    int num;
    {
        num=100;
        System.out.println("initializing values");
    }

    public static void main(String[] args) {
        InstantInitializerBlock ib=new InstantInitializerBlock();
        InstantInitializerBlock ib2=new InstantInitializerBlock();

    }
}
