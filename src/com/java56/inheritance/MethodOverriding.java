package com.java56.inheritance;
class Bank{
    public int getInterestRate(){
        return 1;
    }
}
class Sanima extends Bank{
    @Override
    public int getInterestRate(){
        return 7;
    }
}
class Nabil extends Bank{
    @Override
    public int getInterestRate(){
        return 10;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Sanima sanima=new Sanima();
        System.out.println("Sanima Interest:"+sanima.getInterestRate());

        Nabil nabil=new Nabil();
        System.out.println("Nabil Interest:"+nabil.getInterestRate());


    }

}
