//8. Write a program to find the sum of all odd numbers from 1 to N. Accept N. Display the sum.

import java.util.*;
class Program8{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(i%2!=0){
sum=sum+a[i];
}
}
System.out.println("The sum 0f odd index element is "+ sum);
}
}
