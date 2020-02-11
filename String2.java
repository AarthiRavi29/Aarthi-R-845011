/*  2.Write a program which creates a StringBuffer “This is StringBuffer” and
 performs the following. 

1.	Adds the string ”- This is a sample program” to existing string and 
	display it.
2.	Inserts the string “Object” into the existing string at 21st postion
	 and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.
*/



import java.util.Scanner;
import java.util.*;
 class String2 {
          public static void main(String args[])
    {
     StringBuffer s1=new StringBuffer("This is StringBuffer");
     System.out.println(s1.append("- This is a sample program"));
     System.out.println(s1.insert(21, "object"));
      System.out.println(s1.reverse());
       s1=s1.reverse();
       System.out.println(s1.replace(14,20,"Builder"));
}
}
