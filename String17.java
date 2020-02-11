/*  17. input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb 
reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4    */

import java.util.*;
public class String17 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
int input3=sc.nextInt();
System.out.println(print(input1,input2,input3));
}
static int print(String input1, String input2, int input3) 
{
int n1=Integer.parseInt(input1.substring(5, input1.length()));
int n2=Integer.parseInt(input2.substring(5, input2.length()));
int n=Math.abs((n2-n1)*input3);
return n;
}
}