package com.learn;

public class Code14Strings
{
    public static void main(String[] args)
    {
//        System.out.println("Methods in Strings Demonstration");
        String name= "HARRYSHARMA";
        String name1= name.replace('R', 'P');//replace the character in the string
        String name2= name.replace("RRY", "IER");//replace the sequence of characters in the string
        System.out.println(name2);
        System.out.println(name1);
        System.out.println(name);//string works according to the indexes, it includes 0 as well
        System.out.println(name.length());//length stores the value in a integer format
        System.out.println(name.toLowerCase());//to lowercase the string
        System.out.println(name.toUpperCase());//to uppercase the string
        System.out.println(name.substring(4));//it starts the string from index 4
        System.out.println(name.substring(4,7));//it starts the string from index 4 and ends on 6(7 is excluded)
        String nonTrim= name;
        System.out.println(nonTrim);
        System.out.println(nonTrim.trim());//trim the string with the space
        System.out.println(name.startsWith("HA"));//boolean to check starts with the string
        System.out.println(name.endsWith("RMA"));//boolean to check ends with the string
        System.out.print(name.charAt(4));//find the character at given index of string
        System.out.println(name.indexOf("SHARM"));//gives the starting index of given sub strin
        System.out.println(name.lastIndexOf("RMA"));//returns the last index of given substring,
        // it starts from last index
        System.out.println(name.equalsIgnoreCase("harrySHARMA"));//return the true or false, ignoring the case
        System.out.println(name.equals("HARRYSHARMA"));//returns the true or false, check the string equality
    }
}
