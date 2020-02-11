/* 1. Write a program which creates a String “Welcome to Java World” and perform 
the following 

i.	Returns the character at 5th position and display it.
ii.	Compare the above String with “Welcome” lexicographically ignoring
 case differences and display the result.
iii. Concatenates “- Let us learn” to the above string and display it.
iv.  Returns the position of the first occurrence of character ‘a’ and
 display it.
v.  Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
vi. Returns string between 4th position and 10th position and display it.
vii. Returns the lowercase of the string and display it */


import java.util.Scanner;
import java.util.*;
 class String1 {
    public static void main(String args[])
    {
 String s1="Welcome to Java World";
 System.out.println(s1.charAt(5));
System.out.println(s1.length());
System.out.println(s1.compareToIgnoreCase("Welcome"));
System.out.println(s1.concat("- Let us learn"));
System.out.println(s1.indexOf('a'));
System.out.println(s1.replace('a','e'));
System.out.println(s1.substring(4,10));
System.out.println(s1.toLowerCase());
}
}