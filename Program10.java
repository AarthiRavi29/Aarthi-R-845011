// 10.  Write a program to find the factorial of a non-negative number.

import java.util.*;
class Program10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=1;
for(int i=1;i<=n;i++){
sum=sum*i;
}
System.out.println(sum);
}
}

