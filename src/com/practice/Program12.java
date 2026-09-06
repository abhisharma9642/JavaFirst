package com.practice;

import java.util.Scanner;

public class Program12
{
    public static void main(String[] args)
    {
        System.out.println("To print multiplication table of a given number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int j= sc.nextInt();
        for(int i= 0; i<= j; i++)
        {
            System.out.print(n*i+ " ");
        }
    }
}
