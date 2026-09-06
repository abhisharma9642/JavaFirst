package com.practice;

public class Program9
{
    public static void main(String[] args)
    {
        System.out.println("Demo of While Loops");
        int i= 0;//define the value at start
//        while (i<10)//checks the condition
//        {
//            System.out.print(" "+ i);//execute the statement, along with increment or decrement
//            i++;//it increments and store
//        }
//        System.out.println(" last value of i "+ i);//print the last incremented stored value of i
//        System.out.println("Loop Ends here");

        do//execute the statement at once, then increment or decrement,
        // then check the condition without check conditon
        {
            System.out.print(" "+ i);//execute the statement
            i++;//increment or decrement
        }
        while(i<10);// at last checks the condition, to execute the block of do{}, it must check the condition
    }
}
