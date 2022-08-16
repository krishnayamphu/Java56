package com.java56.basic;

public class Loop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        int num[]={10,20,30,40,50};
        for(int i:num){
            System.out.println(i);
        }

        int n=1;
        while(n<=5){
            System.out.print(n+" ");
            n++;
        }
        System.out.println("\n========================");
        int y=1990;
        do{
            System.out.print(y+", ");
            y++;
        }while(y<=2022);
    }
}
