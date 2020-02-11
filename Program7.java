// 7.  Write a program to accept an alphabet and display whether its a vowel or consonant

import java.util.*;
class Program7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
if(s1.equalsIgnoreCase("a") || s1.equalsIgnoreCase("e") || s1.equalsIgnoreCase("i") || s1.equalsIgnoreCase("o") || s1.equalsIgnoreCase("u") ){
System.out.println("The character is Vowels");
}
else{
System.out.println("The character is Consonats");
}
}
}