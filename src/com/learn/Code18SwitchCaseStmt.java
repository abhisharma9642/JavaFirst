package com.learn;
import java.util.Scanner;
public class Code18SwitchCaseStmt
{
    public static void main(String[] args)
    {
        System.out.println("Demo of Switch Case Stmts");
        Scanner sc= new Scanner(System.in);
        String model= sc.nextLine();
//        if(model > 56)//model greater than 56
//        {
//            System.out.println("model is great");
//        }
//        else if (model < 56)//model is less than 56
//        {
//            System.out.println("model is small");
//        }
//        else if(model == 56)
//        {
//            System.out.println("model is equal to 56");
//        }
        switch (model)
        {
            case "M":
                System.out.println("it is monday");
                break;
            case "T":
                System.out.println("it is Tuesday");
                break;
            case "W":
                System.out.println("it is Wednesday");
                break;
            case "Th":
                System.out.println("it is Thrusday");
                break;
            case "F":
                System.out.println("it is Friday");
                break;
            case "Sa":
                System.out.println("it is Saturday");
                break;
            default:
                System.out.println("it is Sunday");
                break;
        }
    }
}
//switch-case statement
//if statement can work with switch-case statement
//it is necessary to use break statement after every statement in switch-case statement
//default case is that case which when execute neither of the condition met
//switch-case statement can be rewrite like switch(variable)
//case "input variable" ->
//{
//  system.out.println(execute print statement;
//  system.out.println(execute print statement;
//  system.out.println(execute print statement;
//  system.out.println(execute print statement;
//}
