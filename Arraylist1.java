package com.recap;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Object> l1 = new ArrayList<Object>();
l1.add(244);
l1.add(new Integer(2));
l1.add(new Integer(4));
l1.add(new Integer("2"));
l1.add(new Float("43.654"));
l1.add(new String("Aarthi"));
System.out.println("ArrayList Contains : "+l1);
//for each loop
for(Object a:l1)
	System.out.println(a);
	}

}
