package com.learn;

import java.util.Scanner;//to import scanner input class

public class Code5ScannerClass
{
    public static void main(String[] args)
    {
        System.out.println("");
        Scanner sc= new Scanner(System.in);//create object of scanner class to take user input
        System.out.println("Take Number 1 as user input");
        int a= sc.nextInt();//take user input for integer number, it can be anything for input
        boolean b= sc.hasNextInt();
        System.out.println(b);
        System.out.println("Take Number 2 as user input");
        int b2= sc.nextInt();//take user input for integer number, it can be anything for input
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
        System.out.println("Sum of number1 and number2 is- "+ (a+b2) );
    }
}
