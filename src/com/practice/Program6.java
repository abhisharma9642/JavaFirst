package com.practice;

import java.util.Scanner;

public class Program6
{
    public static void main(String[] args)
    {
        System.out.println("Integer number or not");
        Scanner sc= new Scanner(System.in);
        //int number= sc.nextInt();
        boolean b= sc.hasNextInt();
        System.out.println(b);
    }
}
