/* 4. Retrieve the palindorme-true number set from given number limit and
 return the sum
input1:90 input2:120
logic:99+101+111
output:311
Hint:List<Integer> l1=new ArrayList<Integer>();  */



package sample;
import java.util.*;
public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter input1");
Integer input1=sc.nextInt();
System.out.println("Enter Input2");
Integer input2=sc.nextInt();
ArrayList<Integer> l1=new ArrayList<Integer>();
ArrayList<Integer> l2=new ArrayList<Integer>();
int sum=0;
for(Integer i=input1;i<input2;i++){
	l1.add(i);
	l2.add(getvalue(i));
}
l1.retainAll(l2);
for(int i : l1){
	sum=sum+i;
}
System.out.println("Sum of palindrome : " + sum);
sc.close();
	}
	private static Integer getvalue(Integer i) {
		i.toString();
		StringBuffer sb = new StringBuffer();
		sb.append(i);
		sb.reverse();
		String s1 = sb.toString();
		Integer n=Integer.parseInt(s1);
		return n;
	}
}

	

