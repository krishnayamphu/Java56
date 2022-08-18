package com.java56.oop;

public class Student {
    static String sclname="ABC School";
    String stdname;

    public static void schoolAddress(){
        System.out.println("Address: Kumaripati, Lalitpur");
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.stdname="Ram";

        Student s2=new Student();
        s2.stdname="Hari";

        System.out.println("Student name: "+ s1.stdname);
        System.out.println("School name: "+Student.sclname);
        System.out.println("Student name: "+ s2.stdname);
        System.out.println("School name: "+Student.sclname);
        schoolAddress();
    }

}
