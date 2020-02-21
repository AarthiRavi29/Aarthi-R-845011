/*  11.
In a hashmap if key is odd then find average of value as integer
    ex: h1={1:4,2:6,4:7,5:9}
        output=(4+9)/2  */


package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer sum=0 , count=0;
		Integer avg;
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			h1.put(sc.nextInt(), sc.nextInt());
		}
		for(Map.Entry<Integer, Integer> entry:h1.entrySet()){
			if(entry.getKey()%2!=0){
				sum=sum+entry.getValue();
				count++;
			}}
avg=sum/count;
System.out.println("Avg of odd key: "+avg);
sc.close();
	}
}
