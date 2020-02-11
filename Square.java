/*  3. 
Input a int array. Square the elements in even position and cube the
 elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2  */

import java.util.*;
class Square
{

 	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
int i,sum=0,n;
System.out.println("Input the size of array");
 n=sc.nextInt();
int a[] =new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if((i+1)%2 == 0)
a[i]=a[i]*a[i];
else
a[i]=a[i]*a[i]*a[i];
}
System.out.println("Output");
for(i=0;i<n;i++)
{
sum=sum+a[i];
System.out.print(a[i] + " ");
}
System.out.println(" ");
System.out.println(sum);	
	}
}