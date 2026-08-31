package com.learn;

import java.util.Scanner;

public class Code13Strings
{
    public static void main(String[] args)
    {
        System.out.println("Introduction to Strings");
        String name= "Abhishek sharma";
        System.out.println(name);
        Scanner sc= new Scanner(System.in);
        String str= sc.next();// it store only first word from the string
        System.out.println(str);
        String str1= sc.nextLine();//it store complete string as it is
        System.out.println(str1);
    }
}
