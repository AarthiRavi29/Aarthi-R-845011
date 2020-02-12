/*  3. Create a method that returns collection that contain only unique String object in the sorted order. 

Class Name 		: UniqueCollection 
Method Name 		: getCollection 
Method Description 	: Accepts a String array and load the elements into a collection that can hold only unique element in a sorted order. 
Argument		: String []elements 
Return Type		: Interface type of the Collection used
Logic			: Accept a String array, convert it to a collection of unique elements stored in sorted order and return the results.  */

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Collection3 {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] s=new String[n];
for(int i=0;i<n;i++)
{
s[i]=sc.next();
}
List<String> l=Arrays.asList(s);
Set<String> list=new HashSet<String>(l);
getCollection(list);
System.out.println(list);
}
public static Set<String> getCollection(Set<String> list)
 {
//Collections.sort(list);
return list;
  }
}
    