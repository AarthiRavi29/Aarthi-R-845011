/* 6.Design a way to sort the list of positive integers in descending order according to the frequency of elements. The elements with higher frequency come before these with lower frequency. Elements with same frequency i'm in the same order as they appear in the given list. 
Input: 
Input to the function or method consist of arguments- 
arr, list of positive integers 
size, the number of elements in the array 

Output: 
Return a list of positive integers sorted according to frequency of elements present in the array.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class SortByValue implements Comparator<Map.Entry<Integer, Integer>>{
	 
    @Override
    public int compare( Map.Entry<Integer,Integer> entry1, Map.Entry<Integer,Integer> entry2){
        return (entry1.getValue()).compareTo( entry2.getValue() );
    }
}
public class DescendingOrder {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
        TreeMap<Integer,Integer> h1 = new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of positive integer");
		int n=sc.nextInt();
		System.out.println("Enter the positive Integer");
		for(int i=0;i<n;i++){
			Integer num =sc.nextInt();
			if(num>=0){
			l1.add(num);}
			else{
				System.out.println("Invalid Number give postive integer");
				i--;}
		}
		for(int i : l1){
	          h1.put(	i,Collections.frequency(l1, i));
	}
		 Set<Entry<Integer, Integer>> entrySet = h1.entrySet();
	        List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);
		System.out.println(listOfentrySet);
	Collections.sort(listOfentrySet, new SortByValue());
	Collections.reverse(listOfentrySet);
	for(Map.Entry<Integer, Integer> entry:listOfentrySet)
        System.out.print(entry.getKey());
      sc.close();
}
}
