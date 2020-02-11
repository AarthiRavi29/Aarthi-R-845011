/*  10. The environmental eco club has discovered a new Amoeba that grows in the
 order of a Fibonacci series every month. They are exhibiting their amoeba 
in a national conference. They want to know the size of the amoeba at a 
particular time instant. If a particular month’s index is given can you
 write a program that displays the amoeba’s size……???


  
Note: The size of the amoeba on month 1, 2, 3, 4, 5, 6, .. will be 0, 1, 1, 2,
 3, 5, 8 respectively.
 
Sample input and Output 1:

Enter the number of Months :
7
The amoeba size is 8
 
 
Sample input and Output 1:
Enter the number of Months :
12
The amoeba size is 89 */

import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of months");
int n=sc.nextInt();
int a[]=new int[12];
a[0]=0;
a[1]=1;
for(int i=2;i<n;i++){
a[i]=a[i-1]+a[i-2];
}
System.out.println("The amoeba size is "+a[n-1]);
}
}