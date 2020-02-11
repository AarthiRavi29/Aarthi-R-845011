// 4.   Write a program to accept three numbers and find the largest and second largest values of three numbers


import java.util.*;
class Program4{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int val1=sc.nextInt();
int val2=sc.nextInt();
int val3=sc.nextInt();
if(val1>val2 && val1>val3){
System.out.println("The first largest number is "+val1);
if(val2>val3){
System.out.println("The second largest number is "+val2);}
else{System.out.println("The second largest number is "+val3);}
}
else if(val2>val3){
System.out.println("The first largest number is "+val2);
if(val1>val3){
System.out.println("The second largest number is "+val1);}
else{System.out.println("The second largest number is "+val3);}
}
else{
System.out.println("The first largest number is "+val3);
if(val1>val2){
System.out.println("The second largest number is "+val1);}
else{System.out.println("The second largest number is "+val2);}
}
}
}