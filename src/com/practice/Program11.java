package com.practice;

public class Program11
{
    public static void main(String[] args)
    {
        System.out.println("Program to print sum of first n even numbers");
        int sum= 0;//sum starts from 0
        int n= 4;//first n even numbers, 5 numbers will be there from 0 to 4
        for(int i= 0; i< n; i++)
        {
            System.out.print(2*i);
            sum= sum+ (2*i);
        }
        System.out.println("Sum of Even Numbers are "+ sum);
    }
}
//write a program to print the sum of first n even numbers using for loop, while loop and do-while loop