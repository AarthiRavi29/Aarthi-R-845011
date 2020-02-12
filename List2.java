/* 2. Create a class that can accept an array of String objects and  return them
 as a sorted List 

Class Name 		: ListManager
Method Name 		: getArrayList 
Method Description 	: Converts the String array to ArrayList and sorts it
Argument		: String []elements  
Return Type 		: List- ArrayList containing the elements of the String array in sorted order 
Logic 			: Load the elements in to an ArrayList and sort it. 
*/

import java.util.Scanner;
import java.util.*;
 class List2 {
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("input size from user");
	int n=sc.nextInt();
	String s1[]=new String[n];
	
	for(int i=0;i<n;i++){
	s1[i]=sc.next();
}
	ArrayList<String> l1=new ArrayList<String>();
for(int i=0;i<n;i++){
l1.add(s1[i]);
 }	
getArrayList(l1);
System.out.println(l1);	
}	
public static List<String> getArrayList(List<String> l1)
{
Collections.sort(l1);
return l1;
}

}
