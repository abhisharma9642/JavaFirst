package com.learn;

public class Code33VariableArgs
{
    static int sum(int x, int ...arr)//method with infinite args which takes all args in Array
    {
        int result= 0;
        for(int a: arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Variable Arguments in Method Calling in Java Programming Language");
        int[] marks= {100, 90, 80};//variable arguments for dynamic argument execution in method
        int[] marks1= {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};//variable arguments for dynamic argument execution in method
        System.out.println(sum(2, marks));
        System.out.println(sum(4, marks1));
    }
}
