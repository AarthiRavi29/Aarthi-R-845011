/*  10.
HashMap<String,Integer> h1={“abc”:50,”efg”:70};
    if the mark is less than 60 then put the output in the
    HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}
*/
package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
HashMap<String,String> h1=new HashMap<String,String>();
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=0;i<n;i++){
	h1.put(sc.next(), sc.next());
}
System.out.println("Enter the input2");
String m=sc.next();
ArrayList<String> l1 =new ArrayList<String>();
for(Map.Entry<String, String> entry:h1.entrySet()){
	if(entry.getValue().contains(m)){
		l1.add(entry.getKey());
	}
}
System.out.println(l1);
sc.close();
	}

}
