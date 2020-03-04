
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Nonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
String name=sc.nextLine();
String a[]=name.split("");
LinkedList<String> l1 = new LinkedList<String>();
for(int i=0;i<a.length;i++){
	l1.add(a[i]);
}
System.out.println("First non-repeating index is "+l1.indexOf(getValue(l1)));
sc.close();
	}
static String getValue (LinkedList<String> l1){
String s1 = null;
for(String i : l1){
	int count = Collections.frequency(l1, i);
	if(count==1){
	 s1=i;
	 break;
	}
	count=0;
}
return s1;

	}
}
/*
 int count=0;
 for(int i=0;i<name.length();i++){
 for(int j=0;j<name.lrngth();j++){
 if(name.chatAt(i)==name.charAt(j)){
 count++;
 }
 }
 if(count==1){
 System.out.println(i);
 break;
 }
 count=0;
 }
 
 */

