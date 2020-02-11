// 2. Write a program to accept three numbers and find the largest of three numbers using ternary operator.


import java.util.*;
class Program2{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int val1=sc.nextInt();
int val2=sc.nextInt();
int val3=sc.nextInt();
int max;
max = (val1 > val2)? (val1 > val3 ? val1 : val3) :(val2 > val3 ? val2 : val3);
System.out.println("largest number among 3 number is : "+max);
}
}