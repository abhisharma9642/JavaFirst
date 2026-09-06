package com.practice;

import java.util.Scanner;

public class Program15
{
    public static void main(String[] args)
    {
        System.out.println("Practice Program 1");
        float[] marks0= {1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f};
        float summation= 0;
        for(float element: marks0)
        {
            summation= summation+ element;
        }
        System.out.print("the value of sum of all the elements is " +summation);
        System.out.println();
        Scanner sc= new Scanner(System.in);
        int[] marks1= {1, 3, 4, 5, 6, 7, 8};
        System.out.println("Enter the number to be found");
        int sum= sc.nextInt();
        boolean isFind= false;//define the value of boolean to true by default to check if it is true or false
        for(float element: marks1)//loop on each element of array
        {
            if(sum == element)//if element is equal to the number given
            {
                isFind= true;//if found, then break the checking the loop
                break;//then break the loop checking
            }
        }
        if(isFind)//after ending the loop, if boolean value is true, then print true, else false
        {
            System.out.print("Value founded- " +isFind);
        }
        else
        {
            System.out.println("Not found in the array");
        }
    }
}
//it takes each and every element and
// added it to sum and at last it print the sum

