package sample;

import java.util.Scanner;

public class Collections6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int max=0;
System.out.println("enter the number:");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(i%2!=0){
	if(max<a[i]){
		max=a[i];
	}
}
	}
System.out.println(max);
sc.close();

}
}
