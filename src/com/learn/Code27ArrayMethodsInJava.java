package com.learn;

public class Code27ArrayMethodsInJava
{
    public static void main(String[] args)
    {
        System.out.println("Array Methods in Java Programming Language");
        String[] studentName= {"harry", "companion", "komal", "sharma", "meena"};//size of this array is from 0 to 4 that is 5
        System.out.println(studentName.length);
        for(int i= 0; i< studentName.length; i++)//from o to length of array
        {
           System.out.print(studentName[i]+ " ");//display every element of array using the index of array
//            print the elements of array using the for-loop
        }
        System.out.println();
        for(int i= studentName.length-1; i>= 0; i--)
        {
            System.out.print(studentName[i]+ " ");
        }
        System.out.println();
        //display elements of array using for-each loop
        for(String i: studentName)
        {
            System.out.print(i+ " ");//used for accessing the elements of array using index of array
        }
    }
}
//while displaying the elements of array, in the incrementing for loop, from 0 to array.length
//while displaying the elements of array, in the decrementing for loop, from array.length-(1) to 0,
// because index searches in the array from length-1
