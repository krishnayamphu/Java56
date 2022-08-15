package com.java56.basic;

public class Datatype {
    public static void main(String[] args) {
        byte b=127; //-128 to 127
        short s=1200; //-32,768 to 32,767
        int i=40000; //- 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        long l=9841023456L; //-9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
        float f=10.5f;  //32-bit IEEE 754 floating point.Its value range is unlimited.
        double d=100.5d; //double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.
        char ch='A';
        boolean bool=true;

        String name="Aptech"; //not datatype, it is a class type

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(name);

    }
}
