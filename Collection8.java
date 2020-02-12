/*  8. Given a string array as input.The array contains the states and capital 
names separated by a '_'.Write a method which accepts the string array and 
a state name and return the capital of the state.
Note: the check must be case insensitive.

Input1:{'TN_Chennai','Kerala_TVM','Karnataka_BNGLR'}
Input2:Karnataka
Output:BNGLR
*/

import java.util.*;
public class Collection8 
{

    public static void main(String[] args)
 {

Scanner sc=new Scanner(System.in);
String[] s=new String[6];
for(int i=0;i<s.length;i++)
{
s[i]=sc.nextLine();}
String t=sc.nextLine();
String s1="";
for( int i=0;i<s.length-1;i++)
{
if(s[i].contains(t))
{
int n=s[i].indexOf('_');
s1=s[i].substring(n+1);
}
}
System.out.println(s1);

}
}
