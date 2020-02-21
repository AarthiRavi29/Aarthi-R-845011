/*  3. arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak
Hint:Map<String, Integer> =new HashMap<String, Integer>()  */


package sample;
import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
public class Collection3 {
	public static void main(String args[]){
		HashMap<String,Integer> student = new HashMap<String,Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of student");
		int n=sc.nextInt();
		//Integer maxValue=0;
		System.out.println("Enter Student name in the format(name#mark#mark2#mark3)");
		for(int i=0;i<n;i++){
			 String s1 = sc.next();
             StringTokenizer t = new StringTokenizer(s1,"#");
			String name=t.nextToken();
			int m1=Integer.parseInt(t.nextToken());
			int m2=Integer.parseInt(t.nextToken());
			int m3=Integer.parseInt(t.nextToken());
			Integer mark=m1+m2+m3;
			student.put(name, mark); 
		}
			Map.Entry<String, Integer> maxValue = null;
			for (Map.Entry<String, Integer> entry : student.entrySet()) {
				if ( maxValue == null || entry.getValue() > maxValue.getValue()) {
				    maxValue = entry;
		}
	}
	System.out.println("The Student with highest mark is : " + maxValue.getKey());	
	sc.close();
} 
	}
