package com.learn;

import java.util.Scanner;

public class Code16IfElse
{
    public static void main(String[] args)
    {
        System.out.println("If-Else conditions in Java Program");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        boolean cond= age>=18;
        if(cond)
            System.out.println("You are a mature person");
        else
            System.out.println("No, your are not a mature person");
    }
}
