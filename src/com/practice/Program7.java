package com.practice;

import java.util.Scanner;

public class Program7
{
    public static void main(String[] args)
    {
        System.out.println("Practice Set 2");
        float a= 7 / 4 * 9 / 2;
        System.out.println(a);
        char grade= 'B';
        //Encrypting the Grade character
        grade= (char) (grade +9);//char+int= int, but i want it in char data type
        System.out.println(grade);
        //Decrypting the character
        char grade1= (char)(grade - 9);//decrypting the original grade which is 'B'
        System.out.println(grade1);
        System.out.println("Enter the Number to be checked");
        int b= 56;
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        System.out.println((c<b));
        int v= sc.nextInt();
        int u= sc.nextInt();
        int t= 43;
        int s= 32;
        System.out.println( (float) (v*v) - (u*u) / (2*a*t*s) );//value of v*v - u*u / 2*t*a*s
    }
}
