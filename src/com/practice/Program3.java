package com.practice;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        System.out.println("*********CGPA Calculator******");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks1");
        int marks1= sc.nextInt();
        System.out.println("Enter Marks2");
        int marks2= sc.nextInt();
        System.out.println("Enter Marks3");
        int marks3= sc.nextInt();
        float percentage= (float) (marks1+marks2+marks3)/(300)*100;// total marks are out of 100
        System.out.println("The total percentage is-" +(percentage)+ "%" );
    }
}
