package com.java56.basic;

public class Conditional {
    public static void main(String[] args) {
        double x=10, y=6;
        if(x>y){
            System.out.println(x+" is greater");
        }else{
            System.out.println(y+" is greater");
        }

        String username="admin1";
        String password="a123";
        if(username.equals("admin") && password.equals("a123")){
            System.out.println("Welcome to Dashboard Admin");
        }else{
            System.out.println("Invalid username or password");
        }
    }
}
