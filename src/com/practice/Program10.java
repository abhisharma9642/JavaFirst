package com.practice;

public class Program10
{
    public static void main(String[] args)
    {
        System.out.println("Printing the Pattern using Loops");
        int n= 4;
        for(int i= n; i> 0; i--)//starts from 4, then checks the greater condition, decrementing continously
        {
                for (int j= 0; j< i; j++)
                {
                    System.out.print("*");
                }
            System.out.print("\n");
        }
    }
}
//****
//***
//**
//*