package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		HashMap<String,String> h2=new HashMap<String,String>();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			h1.put(sc.next(), sc.nextInt());
		}
		for(Map.Entry<String, Integer> entry:h1.entrySet()){
			if(entry.getValue()>60){
				h2.put(entry.getKey(), "Pass");
			}
			else{
				h2.put(entry.getKey(), "Fail");
			}
		}
		System.out.println(h2);
		sc.close();
	}

}
