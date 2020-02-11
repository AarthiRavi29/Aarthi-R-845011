/*  5. arraylist1={ 1,2,3,4,5}
    arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}  */

import java.util.*;
class Random
{
public static void main(String args[])
{
int j,sum=0,i,n1,n2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of array1");
 n1 = sc.nextInt();
System.out.println("Enter Size of array2");
 n2 = sc.nextInt();
if(n1==n2){
int a1[]=new int[n1];
int a2[]=new int[n2];
System.out.println("arrayList1=");
for( i=0;i<n1;i++){
a1[i]=sc.nextInt();
}
System.out.println("arrayList2=");
for( i=0;i<n2;i++){
a2[i]=sc.nextInt();
}
for( i =0;i<n1;i++)
{
if(i%2==0)
System.out.print(a2[i]+" ");
else
System.out.print(a1[i]+" ");
}}
else{
System.out.println("Size of two array should be same");
}
}}	
 