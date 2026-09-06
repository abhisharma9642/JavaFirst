package com.learn;

public class Code24BreakAndContinue
{
    public static void main(String[] args)
    {
        //System.out.println("Break and Continue Loop Demonstration");
        //Breaks and continue using loops
        for(int i= 0; i< 50; i++)//define the value of i, checks the condition and then increments and decrements
        {
            System.out.println(i);
            System.out.println("Java is a programming language");
            if(i==2)//when i is 2, it will break and then print this statement
            {
                System.out.println("Ending the loop");//just for showing that loop is ending here
                break;
            }
        }
        System.out.println("Loop Ends here with some text statement");
    }
}
//        while(i< 5)//checks the condition
//        {
//        System.out.println(i);//some statement prints
//            System.out.println("Some Statement");//some statements prints
//            if(i==2)//checks the condition, if i is 2, the loop ends and it got broked
//        {
//        System.out.println("Loop ends using break statement");
//                break;//loop got broke using break statement
//                        }
//i++;

//do
//        {
//            print(i);
//            print("java is a programming language");
//            if(i==2)
//            {
//                print("loop ends here using break statement");
//            }
//        }
//        while(i< 5)
//            print("some statements");