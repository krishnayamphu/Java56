package com.java56.exceptionshandling;

public class ThrowDemo {
    public void voter(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You're eligible to vote!");
        }else{
            throw new ArithmeticException("Invalid age");
        }
    }

    public void auth(String username, String password) throws Exception{
        if(username.equals("admin") && password.equals("a123")){
            System.out.println("Welcome Admin");
        }else{
            throw new Exception("Un-authenticate user");
        }
    }

    public static void main(String[] args) {
        ThrowDemo td=new ThrowDemo();
        try {
            td.voter(20);
        }catch (ArithmeticException e){
           System.err.println(e);
           System.err.println("You can't vote cause you re under 18.");
        }

        try {
            td.auth("a", "a1");
        }catch (Exception e){
            System.err.println(e);
            System.err.println("Invalid username or password");
        }
    }
}
