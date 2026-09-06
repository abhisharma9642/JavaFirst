package com.learn;

public class Code23ForLoopInJava
{
    public static void main(String[] args)
    {
        System.out.println("Demonstration of For Loop");
        //int i;
        int n= 5;
        for(int i= 0; i< n; i++)//low to high value, conditon is less than, loop is incrementing
            System.out.print(2*i+1+ " ");
        for(int i= 5; i> 0; i--)//high to low value, conditon is greater than, loop is decrementing
            System.out.println(2*i+1+ " ");
    }
}
//demonstration of for loop
//define the value, it checks the condition, it increments or decrements the value
//in for loop, when it is incrementing, the condition will be less than(it starts from low to high)
//in for loop, when it is decrementing, the condition will be greater than(it starts from high to low)