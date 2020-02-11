/* watermellon */
import java.util.Scanner;
class Task4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int weight=sc.nextInt();
if(weight%2==0){
int mid=weight/2;
int num1=0;
int num2=weight;
for(int i=1;i<=mid;i++){
 num1=num1+1;
num2=num2-1;
System.out.println("combination " +": "+num1 +","+num2);
System.out.println("combination " +": "+num2 +","+num1);
}
}
else{
System.out.println("no watermellon ");
}
}
}


