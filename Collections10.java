/*  10. Given a 'n' digit number.Write a program to find a number formed by the
difference of consecutive digits. Last digit can be left as it is.

Input: 21457
Output: 13127

Input2: 578461
Output2: 214251  */

import java.util.*;
class Collections10{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=n+"";
char[] ch=s.toCharArray();
int[] n1=new int[10];
for(int i=0;i<ch.length-1;i++)
{
n1[i]=Math.abs(ch[i]-ch[i+1]);
System.out.print(n1[i]+"");
}
System.out.print(ch[ch.length-1]);
}}