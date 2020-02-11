// 5. Write a program to accept a student’s name and three marks. Display the total and average. Display result as First class, Second class, Pass class and Fails.

import java.util.*;
class Program5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name=sc.next();
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
int average=total/3;
System.out.println("The Total is "+ total);
System.out.println("The Average is "+ average);
if(average<=35){
System.out.println("The student "+name+" is fail");
}
else if(average>35 && average<=60){
System.out.println("The student "+name+" is Pass");
}
else if(average>60 && average<=85){
System.out.println("The student "+name+" is SecondClass");
}

else{
System.out.println("The student "+name+" is FirstClass");
}
}
}