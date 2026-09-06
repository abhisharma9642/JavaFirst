package com.practice;

class firstClass
{
    private int number;
    private String naam;
    public void setNaam(String n)
    {
        naam= n;
    }
    public String getNaam()
    {
        return naam;
    }
    public void setNumber(int num)
    {
        number= num;
    }
    public int getNumber()
    {
        return number;
    }
}


public class Program18
{
    public static void main(String[] args)
    {
        System.out.println("Demonstration of Access Modifiers");
        firstClass obj= new firstClass();
        obj.setNumber(456);//setting the number using method setter
        obj.setNaam("acer");//setting the number using method setter
        System.out.println(obj.getNumber());//get the number using method return
        System.out.println(obj.getNaam());//get the naam using method return
    }
}
//if variables and  values are set private, so to access them we have to use method(getters and setters)