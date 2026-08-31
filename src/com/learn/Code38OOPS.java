package com.learn;

class first
{
    int id;
    String name;
    public void details()//method defined with void return type
    {
        System.out.println("my id is " + id);//take id as argument
        System.out.println("my name is " + name);//take name as argument
    }
}



public class JavaOOPS
{
    public static void main(String[] args)
    {
//        System.out.println("Java Programming OOPS Concept");
//        System.out.println("This is our custom class");
        first obj= new first();
        //creating the class first object
        first obj2= new first();
        //creating the class second object
        obj.id= 123;
        obj.name= "sharma";
        obj2.id= 321;
        obj2.name= "abhishek";
        //setting the properties using the class object
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj2.id);
        System.out.println(obj2.name);
        obj.details();//print the stmt from method details()

    }
}
