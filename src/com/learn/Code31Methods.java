package com.learn;

public class Java18
{
     int logic(int a, int b)
    {
        int z;
        if(a>b)
        {
            z= a+b;
        }
        else
            z= (a*b)*10;
        return z;
    }
    public static void main(String[] args)
    {
//        System.out.println("Methods in Java Programming Language");
//        System.out.println(logic(2,4));//as a<b, so (a*b)*10
        int g= 87;
        int h= 53;
//        int c= logic(g,h);//c will be stored in c in method which is in class
//        //System.out.println(logic(g,h));//as a(g)>b(h), so, they got added- (g+h)
//        System.out.println(c);
        Java18 obj= new Java18();
        System.out.println(obj.logic(g,h));
    }
}
//while calling the methods, if a method is returning something, it either be written in sout stmt or in another variable
//method will be used in a class, not in main method,
// it can be called in main method using class object
//it will return integer, so int will be return type of this method
//must be written as return type of the method, as int is written in method return type of this method
//if there is a static keyword with the method,
// then it can be called directly using class name neither with the class object
//if there is no static keyword with method name, then to call it in the main method,
// object of that class must be created to call that method
//main method is always static, that's why it got called without using class object creation,
// it just called without any class object
//if we change the values of variables in a method,
// then values defined in the main method while calling that method will not be changed