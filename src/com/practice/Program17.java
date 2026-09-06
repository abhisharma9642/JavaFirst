package com.practice;

class Employee
{
    int salary;
    String name;
    public int getSalary()//return the salary
    {
        return salary;
    }
    public void setName(String nm)//set the name
    {
        name= nm;
    }
    public String getName()//return the name
    {
        return name;
    }
}

class smartPhone
{
    public void ringing()
    {
        System.out.println("Phone is ringing");
    }
    public void vibrating()
    {
        System.out.println("phone is vibrating");
    }
}


public class Program17
{
    public static void main(String[] args)
    {
        Employee obj= new Employee();//creating the class object
        obj.salary= 50000;//setting the salary value
        obj.setName("abhishek meena");
        System.out.println(obj.getSalary());//print the get salary method with salary value
        System.out.println(obj.getName());//print the name method with name value
        System.out.println("Program Practice for OOPS in Java Programming");
        smartPhone sp= new smartPhone();
        sp.ringing();
        sp.vibrating();
    }
}