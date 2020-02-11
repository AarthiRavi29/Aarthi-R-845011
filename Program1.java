/* 1.      Write a program to accept a double value. Separate the whole value from the fractional value and store them in two variables.
 Display the same.*/

import java.util.*;
import java.lang.String;
class Program1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double value=sc.nextDouble();
String s1=String.valueOf(value);//Double.toString(value);
//System.out.println(s1);
String[] a=s1.split("\\.",2);
for( String result:a)
    System.out.println(result);
  }
}