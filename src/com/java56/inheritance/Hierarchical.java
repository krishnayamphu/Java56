package com.java56.inheritance;
class Mobile{
    String model;
    String brand;
}
class Samsung extends Mobile{

}
class Apple extends Mobile{

}
public class Hierarchical {
    public static void main(String[] args) {
        Samsung gs12=new Samsung();
        gs12.brand="Samsung";
        gs12.model="Galaxy s12";

        Apple iphone13=new Apple();
        iphone13.brand="Apple";
        iphone13.model="Iphone 13 Max Pro";

        System.out.println("Mobile Brand: "+gs12.brand);
        System.out.println("Mobile Model: "+gs12.model);

        System.out.println("Mobile Brand: "+iphone13.brand);
        System.out.println("Mobile Model: "+iphone13.model);
    }
}
