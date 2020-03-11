package com.recap;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {

	
public static void print(List<?>obj)
//<?> it may place the generics at runtime based on user need 
//according to our prog fst String then Integer
//unbounded wilcard
{
	for(Object a : obj){
		System.out.println(a);
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList a1 = new ArrayList();
	a1.add("Jaava 1.0-5.0");
	a1.add(23545.34f);//float
	
	//non generic - typecasting
	String s1 = (String)a1.get(0);
	System.out.println("Non generic: "+s1);
	ArrayList<String> a2 = new ArrayList<String>();
	ArrayList<String> a3 = new ArrayList();//valid
	a2.add("Java");
	a2.add("Python");
	//a2.add(545);//error with generic you cant assign diff type of value
	//a2.add(545.545f);
	a2.add("Dotnet");
	String s2=a2.get(0);//no typecasting
	System.out.println("Generics: "+s2);
	print(a2);
	
List<Integer> l2 = new ArrayList<Integer>();
l2.add(100);
l2.add(200);
print(l2);
	}

}
