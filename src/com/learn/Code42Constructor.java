package com.learn;

class classOne
{
    private int number1;
    private String naam1;
    public classOne(int number2, String naam2)
    {
        this.naam1= naam2;
        this.number1= number2;
    }
    public int getNumber1()
    {
        return number1;
    }
    public String getNaam1()
    {
        return naam1;
    }
}



public class Code42Constructor
{
    public static void main(String[] args)
    {
        System.out.println("Java Constructor in Programming Logic");
        classOne o= new classOne(2, "sharma");
        System.out.println(o.getNumber1());
        System.out.println(o.getNaam1());

    }
}
//constructor will be always be in class itself, not outside the class defined already before
//constructors in Java programming can be overloaded with different parameters or arguments
//with same name of constructors