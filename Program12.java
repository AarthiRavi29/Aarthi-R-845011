// 12.  Write a program to find the sum of all the prime numbers in the range n to m.


import java.util.*;
class Program12{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int start=sc.nextInt();
int end=sc.nextInt();
int sum=0;
for(int i=start;i<=end;i++)
{
boolean prime=checkPrime(i);
if(prime==true)
sum=sum+i;
}
System.out.println(sum);
}
 static boolean checkPrime(int numberToCheck) 
{ 
int flag=0;
for (int i = 2; i*i <= numberToCheck; i++) 
{ 
 if (numberToCheck % i == 0)
 { 
 flag=1;
break; 
} 
} 
if(flag==0)
return true;
else 
return false;
 }
}