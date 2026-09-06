package com.practice;

import java.util.Scanner;

public class Program8
{
    public static void main(String[] args)
    {
        String str= "LAPTOP IS NOT WORKING PROPERLY";
        //System.out.println(str.toLowerCase());
        String str1= "_abhi_9642";
        //System.out.println(str1.replace("_", "."));
        Scanner sc= new Scanner(System.in);
        String str2= sc.nextLine();
//        System.out.println("Entered string is "+ str2);
//        System.out.println(" Letter =  \n \t \"Dear "+ str2+ ", Thanks a Lot !! \" ");
        System.out.println(str2.contains("  "));//checks double spaces in a string
        System.out.println(str2.contains("   "));//checks triple spaces in a string

    }
}
