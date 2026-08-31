package com.learn;

public class ContinueInLoops
{
    public static void main(String[] args)
    {
        System.out.println("Demonstration of Continue Statements using Loops");
        for(int i= 0; i< 5; i++)
        {
            if(i==3)
            {
                System.out.println("Loop continues on this condition when i is 3");
                continue;
            }
            System.out.println(i);
            System.out.println("Continue Statement using Loops");
        }
    }
}
//continue statements is used when, at some condition we have to execute some other stmt
//when condition met,
// it continue to executing the loop and ends with the stmt which is inside the continue block in the loop
//in the continue block, at some condition it do not execute the looping statement