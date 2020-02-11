// 9.      Write a program to find the reverse of a number. Store the reverse value in a different variable. Display the reverse.

import java.util.*;
class Program9{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int div=n;
int rem,reverse=0;
while(div>0){
rem=div%10;
reverse=(reverse*10) + rem;
div=div/10;
}
System.out.println(reverse);
}
}

