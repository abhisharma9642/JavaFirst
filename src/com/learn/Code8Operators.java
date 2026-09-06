package com.learn;
public class Code8Operators
{
    public static void main(String[] args)
    {
        System.out.println("Operators in Java Language");
        int a= 4;
        int b= 6 % a;
        System.out.println(b);//b is 2
        b += 3;
        System.out.println(b);//b is 5(2+3)
        System.out.println(b==b);
        System.out.println(64>6);
        System.out.println(64<6 && 64>6);//both the conditions must be true to
        // get true result otherwise it will be false

    }
}
