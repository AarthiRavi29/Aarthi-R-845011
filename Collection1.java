/*  1. Given two integer arrays, merge the common elements into a new array.
 find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7  */




package sample;
import java.util.*;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum=0;
ArrayList<Integer> l1 = new ArrayList<Integer>();
ArrayList<Integer> l2 = new ArrayList<Integer>();
System.out.print("Enter the size of input1");
int n1=sc.nextInt();
for(int i=0;i<n1;i++){
	l1.add(sc.nextInt());
}
System.out.print("Enter the size of input2");
int n2=sc.nextInt();
for(int i=0;i<n2;i++){
	l2.add(sc.nextInt());
}
l1.retainAll(l2);
System.out.println(l1);
for(int i : l1){
	sum=sum+i;
}
System.out.println("Sum of common elements in 2 list: "+sum);
sc.close();
}
}
