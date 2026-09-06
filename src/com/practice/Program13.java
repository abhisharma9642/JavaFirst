package com.practice;

import java.util.Scanner;

public class Program13
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication table of given number in reverse order");
        Scanner sc= new Scanner(System.in);
        int n= 10;//table of given number
        for(int i= 10; i>= 1; i--)//how many times table number will be printed
        {
            System.out.print(n*i+ " ");
        }
    }
}
