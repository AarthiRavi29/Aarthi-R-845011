// 14.  Write a program to find the factorial of a number using recursion.

import java.util.*;
class Program14{

static int fact(int n){
if (n == 0)    
return 1;    
 else 
return (n*fact(n-1));
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int factorial=fact(n);
System.out.println("Factorial of number "+n+" is "+factorial);
}
}

