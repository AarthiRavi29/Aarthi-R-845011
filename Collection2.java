/* 2. Retrieve the odd numbers till given input number. add and subtract it 
consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3  */



package sample;

import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		int a[]=new int[20];
		int n=sc.nextInt();
				for(int i=1;i<=n;i++){
					if(i%2!=0){
						a[c]=i;
						c++;
					}
				}
				int sum=a[0];
				for(int i=1;i<c;i++){
					if(i%2==0){
						sum=sum-a[i];
					}
					else{
						sum=sum+a[i];
					}
				}
				System.out.print("sum of odd element : "+ sum);
				sc.close();
	}

}
