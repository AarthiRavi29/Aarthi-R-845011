/*

7. Create a program to get the hashmap from the given input string array where the key for the hashmap
   is first three letters of array element in uppercase and the value of hashmap is the element itself
   Input:{“goa”,”kerala”,”gujarat”}                 [string array]
   Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]
   */

package sample;

import java.util.HashMap;
import java.util.Scanner;

public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
HashMap<String,String> h1 = new HashMap<String,String>();
System.out.println("Enter the number:");
int n=sc.nextInt();
String s[]=new String[n];
for(int i=0;i<n;i++){
	s[i]=sc.next();
}
for(int i=0;i<n;i++){
	String s2 =s[i].toUpperCase();
	String s1 =s[i].toLowerCase();
	h1.put(s2, s1);
}
System.out.println(h1);
sc.close();
	}

}
