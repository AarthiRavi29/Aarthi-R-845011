package com.recap;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1 = new ArrayList<Object>();
		l1.add(244);
		l1.add("Aarthi");
		l1.add(23.45);
		//Generic is not mentioned so we need typcast to
		//assing the value to particular type
		Integer x=(Integer) l1.get(0);
		String y=(String) l1.get(1);
		//String z=(String) l1.get(2);//invalid double cant assign to String
		Double z=(Double) l1.get(2);
		System.out.println(x+" "+y+" "+z);
		
	}

}
