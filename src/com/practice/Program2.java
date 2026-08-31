package com.practice;

import java.util.Scanner;

public class JavaFifthProgram1
{
    public static void main(String[] args)
    {
        System.out.println("CBSE Percentage Calculator");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        int marks1= sc.nextInt();//subject1 marks
        System.out.println("Enter Marks of Subject 2");
        int marks2= sc.nextInt();//subject2 marks
        System.out.println("Enter Marks of Subject 3");
        int marks3= sc.nextInt();//subject3 marks
        System.out.println("Enter Marks of Subject 4");
        int marks4= sc.nextInt();//subject4 marks
        System.out.println("Enter Marks of Subject 5");
        int marks5= sc.nextInt();//subject5 marks
        int total= marks1+marks2+marks3+marks4+marks5;
        float percentage= (total)/500f;
        System.out.println("Percentage of Student is "+ (percentage)*100+ "%");

    }
}
