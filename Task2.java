/*How to move with offer */

import java.util.Scanner;
class Task2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int pro1=sc.nextInt();
int pro2=sc.nextInt();
int pro3=sc.nextInt();
int lp=0;
if(pro1<pro2){
if(pro1<pro3){
lp=pro1;
}
}
else if(pro2<pro3){
lp=pro2;
}
else{
lp=pro3;
}
System.out.println("least product vaue "+lp);
int add=pro1+pro2+pro3;
double off1=add-(add*0.2);
int off2=add-lp;
System.out.println("Total amount with 20% discount "+off1);
System.out.println("Total amount with free of least product "+off2);
if(off1>off2){
System.out.println("Go for offer1");
}
else{
System.out.println("Go for offer2");
}
}
}
