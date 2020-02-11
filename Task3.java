
import java.util.Scanner;
class Task3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int choco=sc.nextInt();
int child=sc.nextInt();
for(int i=1;i<=child;i++){
if(choco>=i){
choco=choco-i;
}
else{
int n=child-(i-1);
System.out.println("remaining choco value "+choco);
System.out.println("number of person remaining "+n);
break;
}
}
}
}