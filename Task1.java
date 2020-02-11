/*Check the Lucky Customer */
import java.util.Scanner;
class Task1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int bill=sc.nextInt();
int date=sc.nextInt();
int x=date;
int count=0;
while(x!=0){
 x=x/10;
int rem=x%10;
count++;
}
System.out.println(count);
int m=bill%10;
int n=m%10;
System.out.println(m);
System.out.println(n);
if(count==1){
if(n==date){
System.out.println("lucky customer");
}
else{
System.out.println("not lucky customer");
}
}
else if(count==2){
if(m==date){
System.out.println("lucky customer");
}
else{
System.out.println("not lucky customer");
}
}
else{
System.out.println("sorry");
}
}
}



