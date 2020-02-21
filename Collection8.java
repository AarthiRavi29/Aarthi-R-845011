/* 8. String[] input1=["Vikas","Lokesh",Ashok]
   expected output String: "Vikas,Lokesh,Ashok"
   */


package sample;

import java.util.Scanner;

public class Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			String s1=s[i];
			System.out.print(s1 + s1.join(s1, ","));
		}
		sc.close();
	}

}
