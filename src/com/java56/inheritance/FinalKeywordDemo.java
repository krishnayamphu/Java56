package com.java56.inheritance;
final class A{
    public final void test(){
        System.out.println("test msg.");
    }
}
class B //extends A [:- A class is final]
{

}
public class FinalKeywordDemo //extends A
{
    final int max_speed=200;

    /* it is not possible to override bcoz method is final
    public void test(){
        System.out.println("test msg.");
    }
*/
    public static void main(String[] args) {
        FinalKeywordDemo ob=new FinalKeywordDemo();
       // ob.max_speed=300;

    }
}
