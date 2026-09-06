package com.practice;

public class Program16
{
    public static void main(String[] args)
    {
        System.out.println("Summation of 2D Array using 2*3 Matrix");
        int[][] matrix1= {{1,4, 6}, {6, 8, 10}};//one row, three columns, second row three columns
        int[][] matrix2= {{12, 14, 16}, {18, 20, 22}};
        int[][] result= {{0, 0, 0}, {0, 0, 0}};
        for(int i=0; i< matrix1.length; i++)
        {
            for(int j= 0; j<matrix1[i].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
        }
    }
}
