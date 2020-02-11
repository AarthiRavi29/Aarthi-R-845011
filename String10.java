/* 10. 
Write a Program that accepts a string and removes the duplicate characters. */

import java.util.Scanner;
import java.util.*;
 class String10 {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2 = new String(); 
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(s2.indexOf(c) < 0)
{
s2 =s2+c;
}
}
System.out.print("Dublicates removed: "+ s2);
}
}