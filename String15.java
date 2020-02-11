/*15. compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+  */

import java.util.Scanner;
public class String15 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String n1=sc.nextLine();
System.out.println(display(n,n1));
}
 
public static String display(String s,String s1)
{
String s2=s.toLowerCase();
String s3=s1.toLowerCase();
StringBuffer sb=new StringBuffer();
for(int i=0;i<s.length();i++)
{
char c=s2.charAt(i);
if(s3.indexOf(c)==-1)
sb.append("+");
else
sb.append(s.charAt(i));
} return sb.toString();
 
}
}
