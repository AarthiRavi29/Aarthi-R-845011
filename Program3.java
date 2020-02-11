// 3. Write a program to accept a number and display whether the number is odd or even using the ternary operator.



import java.util.*;
class Program3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int val1=sc.nextInt();
String result;
result = (val1%2==0)?"Even" : "Odd";
System.out.print("The number "+ val1 +" is "+result);
}
}