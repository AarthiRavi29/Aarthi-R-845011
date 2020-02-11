// 13.  Write a program to store N elements in an array of integer. Display the elements. Accept a number to be searched. Display whether the number is found or not in the array (LINEAR SEARCH).


import java.util.*;
class Program13{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the Search element");
int m=sc.nextInt();
for(int i=0;i<n;i++){
if(a[i]==m){
System.out.println("Search element "+a[i]+" found in the array at index "+i);
}
}
}
}