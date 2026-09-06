package com.learn;

public class Code28MultiDimensionaArray
{
    public static void main(String[] args)
    {
        System.out.println("Multi-Dimensional Array Demonstration");
        int[] marks2;
        int[][] marks1= new int[2][3];//2 rows and 3 columns, at each row, there will be 3 columns
        marks1[0][0]= 101;//first row, first column
        marks1[0][1]= 102;//first row, second  column
        marks1[0][2]= 103;//first row, third column
        marks1[1][0]= 201;//second row, first column
        marks1[1][1]= 202;//second row, second column
        marks1[1][2]= 203;//second row, third column
        System.out.println("Printing a 2-d array using for loop");
        for(int i= 0; i< marks1.length; i++)
        {
            for(int j = 0; j< marks1[i].length; j++)
            {
                System.out.print(marks1[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
//first row- 0 and second row- 1, first column-1, second column-2, third column-3
//2-d array will be implemented using rows and columns