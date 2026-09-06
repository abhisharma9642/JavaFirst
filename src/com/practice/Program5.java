package com.practice;

import java.util.Scanner;

public class Program5
{
    public static void main(String[] args)
    {
        System.out.println("Convert Kms to Miles");
        Scanner sc= new Scanner(System.in);
        float kms= sc.nextFloat();
        System.out.println("In Miles is- "+ (0.621317)*kms);
    }
}
