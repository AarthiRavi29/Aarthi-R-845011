/*   5.HashMap with regnum as key and mark as value. find the avg of marks
 whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90  */


package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0 , count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
HashMap<Integer,Integer> h1 =new HashMap<Integer,Integer>();
System.out.println("Enter the register number as key and mark as value");
for(int i=0;i<n;i++){
	h1.put(sc.nextInt(), sc.nextInt());
}
for(Map.Entry<Integer, Integer> entry:h1.entrySet()){
	if(entry.getKey()%2!=0){
		sum=sum+entry.getValue();
		count++;
	}
	}
int avg = sum/count;
System.out.println("Average of odd key mark is "+ avg);
sc.close();
}
}
