/*  12. HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
    String[] input2={“speaker”,”mouse”};
    Float output=600.80(500.6+100.2);
*/

package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer sum=0 ;
		HashMap<String,String> h1=new HashMap<String,String>();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			h1.put(sc.next(), sc.next());
		}
		System.out.println("Enter the number of key which has to be searched");
		int m=sc.nextInt();
		String[] s=new String[m];
		for(int i=0;i<m;i++){
			s[i] = sc.next();
		}
		for(Map.Entry<String, String> entry:h1.entrySet()){
			for(int i=0;i<m;i++){
			if(entry.getKey().equals(s[i])){
				int x=Integer.parseInt(entry.getValue());
				sum=sum+x;
			}}}
System.out.println("Sum of value for the given key: "+sum);
sc.close();
	}

}
