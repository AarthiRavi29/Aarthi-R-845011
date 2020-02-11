// 6. Write a program to accept a number and display the last digit of the number in words.

import java.util.*;
class Program6{
public static void main(String args[]){
int number;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
int last=number%10;
switch (last) { 
case 0: System.out.println("zero"); 
break;
case 1: System.out.println("one"); 
break;
case 2: System.out.println("Two");  
break;
case 3: System.out.println("Three");
break;
case 4: System.out.println("Four");
break;
case 5: System.out.println("Five");
break;
case 6: System.out.println("Six");
break;
case 7: System.out.println("Seven");
break;
case 8: System.out.println("Eight");
break;
case 9: System.out.println("Nine");
break;
default: 
System.out.println("Invalid data");
break;
}
}
}       
