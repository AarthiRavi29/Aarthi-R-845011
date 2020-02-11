/* 2. 
Get two integer arrays as input. Find if there are common elements in the
arrays. find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4)  */

import java.util.Scanner;
import java.util.*;
 class Common {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
int n1,n2,count=0,i,j,k,m;
System.out.println("input1 size from user");
n1=sc.nextInt();
int a[]=new int[n1];
for(i=0;i<n1;i++){
 a[i]=sc.nextInt();
}
System.out.println("input2 size from user");
n2=sc.nextInt();
int b[]=new int[n2];
for(j=0;j<n2;j++){
 b[j]=sc.nextInt();
}
for( i=0;i<n1;i++){
for( j=0;j<n2;j++)
{
if(a[i]==b[j]){
count=count+2;
}
}
}
int c[]=new int[count];
for( i=0;i<n1;i++){
for( j=0;j<n2;j++)
{
if(a[i]==b[j]){
m=a[i];
for( k=0;k<count;k++){
if(a[k]==m||b[k]==m){
c[k]=m;
}
}
}
}
}
System.out.print(count+"( ");
for( k=0;k<count;k++){
System.out.print(c[k]+" ");
}
System.out.print(")");

}}