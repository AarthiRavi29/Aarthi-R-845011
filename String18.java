/* 18. ount the number of times the second word in second string occurs in
 first string-case sensitive

input1=hai hello hai where hai Hai;
input2=what hai
output=3;  */

import java.util.*;
import java.util.StringTokenizer;
public class String18 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1= sc.nextLine();
String s2= sc.nextLine();
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
int count=0;
StringTokenizer st=new StringTokenizer(s2," ");
String s3=st.nextToken();
String s4=st.nextToken();
//System.out.println(s4);
StringTokenizer st1=new StringTokenizer(s1," ");
while(st1.hasMoreTokens())
{
String s5=st1.nextToken();
if(s4.equals(s5))
{
count++;
}
}
System.out.println(count);
}
}