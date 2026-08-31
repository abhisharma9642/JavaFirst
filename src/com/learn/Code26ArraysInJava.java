package com.learn;

import java.util.Arrays;

public class ArraysInJava
{
    public static void main(String[] args)
    {
        System.out.println("Introduction to Arrays");
        int[] marks= {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};//size of array is 5, it stores form 0 to 4 values in the array
        System.out.println(Arrays.toString(marks));//print the array with all the values
        //to print all the values of array in single line or next line,
        // we have to explicit convert the array into string data type
        System.out.println(marks.length);//here, length of array starts from 0 to 9 that is 10 length of array
    }
}
//arrays are used to store multiple numbers of same data type
//size of the array starts from 0 to n
//how to access and store the values in the array
//marks[0]= 100, marks[1]= 90, marks[2]= 80, marks[3]= 70....
//we can change the value of any array index by mentioning the array value
//there are three ways in which we can declare the array
//int[] marks, marks= new int[];--decalation of array, then memory allocation
//int[] marks= new int[];-- declaration + memory allocation
//int[] marks= {1--, 90, 80,70, 60, 50, 40,30, 20, 10};--- declaration + initialization,
// here size defined automatically at the time of initialization