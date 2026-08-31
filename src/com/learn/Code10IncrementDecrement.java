package com.learn;

public class IncrementOrDecrement
{
    public static void main(String[] args)
    {
        System.out.println("Increment and Decrement Operators");
        byte b= 5;
        int i= 45;
//        char c= 'A';
//        float f= 45.6f;
//        double d= 23.34;
//        short s= 78;
//        long l= 7923498728972343L;
//        //result of the combinations
//        int num1= b+s; //byte+short
//        int num2= s+i; //short+int
//        float num3= l+f; //long+float
//        float num4= i+f; //int+float
//        int num5= c+i; //char+int
//        int num6= c+s; //char+short
//        double num7= l+d; //long+double
//        double num8= f+d; //float+double
//        System.out.println("num1 " +num1);
//        System.out.println("num2 "+ num2);
//        System.out.println("num3 "+ num3);
//        System.out.println("num4 "+ num4);
//        System.out.println("num5 "+ num5);
//        System.out.println("num6 "+ num6);
//        System.out.println("num7 "+ num7);
//        System.out.println("num8 "+ num8);
        //System.out.println("Increment and Decrement Operators");
//        System.out.println(i++);//it increment but do not print, it only stores to print, use system.out.println stmt
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i);//it increment as well it print also at the same time
        int y= 7;
        int x= ++y * 8;//it increments as it stores and then it multiplied by 8, (7+1) * 8= 8 * 8= 64
        System.out.println(x);
        //it works same for characters also
        char a= 'A';
        System.out.println(a++);//it increment and store
        System.out.println(++a);//it increment previously store the value of a that is b
    }
}
//b= byte, s= short, f= float, i= integer, d= double, l= long, c= char
//byte + short= int
//short + int= int
//long+ float= float
//int + float= float
//char + int= int
//char + short= int
//long + double= double
//float + double= double
//for increment and decrement operators, i++ first it increment but do not print, ++i it increment as well it print also
