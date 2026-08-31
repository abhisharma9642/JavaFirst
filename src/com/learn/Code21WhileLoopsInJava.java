package com.learn;
public class WhileLoopsInJava
{
    public static void main(String[] args)
    {
        System.out.println("Loops in Java Programming");
        int i= 1;
        while(i<=3)//value defined, check here and then go to next line and print the output
        {
            System.out.println(i);//print the statement
            i++;//then increment, here i has been incremented and stored incremented value of i
        }//after this again, go to step 9 until i > 3, it stop as soon as i > 3
        //after this bracket, loop ends
        System.out.println("Loop Ends here");
    }
}


//While Loop= it checks, it print the statement, then it increment until the condition mets
//to execute a program multiple times using a feq instructions
//if condition never become false, the while loop execute infitely
//        while(true)//here, loop ends, but condition is true, that's why it is getting executed continously
//        {
//            System.out.println("*");
//        }
//first define the value, it checks the condition, it execute the print the statement, it then increment or decrement