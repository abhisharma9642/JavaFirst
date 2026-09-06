package com.learn;

public class Code32MethodOverloading
{
    static void method()//method with no args
    {
        System.out.println("Method is calling");
    }
    static void method(int a, int b)//same method with 2 args
    {
        System.out.println(a+b);
    }
    static void method(String a, String b, String c)//same method with 3 args
    {
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args)
    {
        System.out.println("Method Overloading in Java Language");
        method();
        method(2,3);
        method("sharma", "abhishek", "meena");
    }
}
//if a void is written in a method, then stmts in that method will be executed without using print statement directly called the method,
// then print statement will be executed
//method overloading is the concept in which same method and same method name with different arguments
//in the method overloading return type of the method must be the same, otherwise method overloading do not worked