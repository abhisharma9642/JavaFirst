package com.practice;

import java.util.Scanner;

public class Program4
{
    public static void main(String[] args)
    {
        System.out.println("Name String Concatenation");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name");
        String str= sc.nextLine();
        System.out.println("Hello " + str+ " ,have a good day !");
    }
}
