/* 9. Given an arraylist of strings,write a method to return the string
formed by the last character of each string.

Input:
['ab','a','abcd']

Output:
['car','java','mat']
*/

package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class List9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s2="";
		String[] s1= new String[n];
		for(int i=0;i<n;i++){
			s1[i]=sc.next();
		}
		for(int i=0;i<s1.length;i++){
			s2 +=s1[i].substring (s1[i].length()-1);
		
		}
		System.out.print(s2);
	}

}
