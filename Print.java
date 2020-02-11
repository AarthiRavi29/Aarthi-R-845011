/*  9. Write a java program to print all numbers between a and b
 (a and b inclusive) using a for loop.

Input Format:
Input consists of 2 integers. The first integer corresponds to a and the 
second integer corresponds to b. Assume a<=b.

Output Format:
Refer Sample Input and Output for formatting specifications.


Sample Input and Output:
Enter the value of a
4
Enter the value of b
10
Output:
4
5
6
7
8
9
10  */

import java.util.Scanner;
class Print{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value a : ");
int a=sc.nextInt();
System.out.println("Enter the value b : ");
int b=sc.nextInt();
for(int i=a;i<=b;i++){
System.out.println(i);
}
}}