package com.learn;

import javax.print.attribute.standard.NumberOfDocuments;

public class Code17LogicalOperators
{
    public static void main(String[] args)
    {
        System.out.println("Demo of Relational and Logical Operator");
        boolean a= true;
        boolean b= false;
//        if(a && b)//1 && 0= 0
//        {
//            System.out.println("1");
//        }
//        else if(a || b)
//        {
//            System.out.println("no");
//        }
//        else
//        {
//            System.out.println("message disturbed");
//        }
        System.out.println(!a);//a is true
        System.out.println(!b);//b is false
    }
}
/*YES && YES= YES, 1 && 1= 1
YES && NO= NO, 1 && 0= 0
NO && YES= NO, 0 && 1= 0
NO && NO= NO, 0 && O= 0
YES || YES= YES, 1 || 1= 1
YES || NO= YES, 1 || 0= 1
NO || YES= YES, O || 1= 1
NO || NO= NO, 0 || 0= 0
*/