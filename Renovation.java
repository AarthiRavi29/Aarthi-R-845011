/* 2. In a town the houses are marked with English alphabets. a committee in the town wants to renovate houses in the town. As the funds are limited so they plan to renovate only the houses mark with vowels. The committee head give the list of houses to the members ask them to identify the houses which were not renovated. 
Write an algorithm to help the committee numbers find the list of houses that at where not renovated. 

Input 
The input to the function or method consist of one argument- Houses, string represent in the sequence of house markings . 

Output: 
Return a string representing the list of houses that was not renovated. 
Constraints: 
All  houses markings are of English alphabets. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Renovation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		ArrayList<String> l2=new ArrayList<String>();
		ArrayList<String> l3=new ArrayList<String>();
		l2.add("a");
		l2.add("e");
		l2.add("i");
		l2.add("o");
		l2.add("u");
		l2.add("A");
		l2.add("E");
		l2.add("I");
		l2.add("O");
		l2.add("U");
getHouse(l1);

for(String i : l1){
	if(l2.contains(i)){
		//System.out.println(i);
		continue;
	}
	else{
		l3.add(i);
	}
}
System.out.println("Houses that are not renovated");
System.out.println(l3);
	}
static ArrayList<String> getHouse(ArrayList<String> l1){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of houses");
	int n=sc.nextInt();
	System.out.println("Enter the house name in alphabet");
	for(int i=0;i<n;i++){
		l1.add(sc.next());
	}
	sc.close();
	return l1;

}
}
