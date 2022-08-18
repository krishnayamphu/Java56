package com.java56.oop;

public class MathTest {
    public void test() {
        System.out.println("Math test");
    }

    public double getPi() {
        return 3.14;
    }

    public void sum(int a, int b) {
        System.out.println("Total sum: " + (a + b));
    }

    public double getDiscount(double price, double percentage) {
        double discount = price * (percentage / 100);
        return discount;
    }

    public static void main(String[] args) {
        MathTest m=new MathTest();
        m.test();

        System.out.println(m.getPi());
        m.sum(10,5);
        System.out.println("Discount: "+m.getDiscount(1000,10));
    }
}
