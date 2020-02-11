/*  4. Retrieve the odd-position digits from input integer array.
 Multiply them with their index and return their sum.  */

import java.util.*;
class Oddpos
{
public static void main(String args[])
{
int i,n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of array");
 n = sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all values");
for(i=0;i<n;i++){
 a[i] = sc.nextInt();
}
System.out.println("Retrived odd position");
for(i=0;i<n;i++)
{	
if(i%2==0)
{
System.out.println(a[i]);
sum=sum+a[i]*i;
}
}
System.out.println("Sum ="+sum);			
	}
}	