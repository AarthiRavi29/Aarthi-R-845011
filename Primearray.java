/* 1. Get a integer array as input. Find the average of the elements which are
 in the position of prime index
input:{1,2,3,4,5,6,7,8,9,10}
logic:3+4+6+8(the indeces are prime numbers)
output:21
*/

import java.util.Scanner;
import java.util.*;
 class Primearray {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
int a[]=new int[10];

for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
int sum=a[2],f=0;
for(int i=3;i<10;i++){
 for (int j=2;j<i;j++){
if (i%j==0)
  {
 f=0;
 break;
 }
 else
 {
  f=1;
 }
}
if (f==1)
{
sum=sum+a[i]; 
}
}
 System.out.print(sum);
}
}
