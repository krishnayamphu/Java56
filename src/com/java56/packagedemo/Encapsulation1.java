package com.java56.packagedemo;

public class Encapsulation1 {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println("Company: "+e.getCompany());

        Bike bike=new Bike();
        bike.setMaxSpeed(200);

        Bank bank=new Bank();
        bank.setName("NMB Bank");
        bank.setAddress("Kumaripati, Lalitpur");

        System.out.println("Bank Name:"+bank.getName());
        System.out.println("Address: "+bank.getAddress());

        Bank bank1=new Bank();
        bank1.setName("Sanima Bank");
        bank1.setAddress("Kumaripati, Lalitpur");

        System.out.println("Bank Name:"+bank1.getName());
        System.out.println("Address: "+bank1.getAddress());
    }
}
