package com.java56.inheritance;
class School{
    String schoolname;
    public School(String s){
        System.out.println("School "+s+" object is created.");
    }
    void info(){
        System.out.println("Showing school info");
    }
}
public class Student extends School{
    public Student(){
        super("Ram");
        System.out.println("student is created");
    }

    void test(){
        super.schoolname="Abc";
        System.out.println("School name:"+super.schoolname);
       super.info();
    }
    public static void main(String[] args) {
        Student sita=new Student();
        sita.test();

    }
}
