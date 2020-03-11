package com.recap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// unordered
		Map<Integer, String> hm = new HashMap<Integer,String>();
	//	Map h1 = new HashMap();//valid
		hm.put(10,"Insurance");
		hm.put(15,"Finance");
		hm.put(25, "Training");
		hm.put(20, "Admin");
		System.out.println("HashMap: "+hm);
//iteration over keys only
		for(Integer m:hm.keySet()){
			System.out.println("key = "+m);
		}
		for(String n:hm.values()){
			System.out.println("Value = "+n);
		}
		
		String b=hm.get(10);//key
		System.out.println("value @ key 10"+b);
		hm.put(10, "Testing");
		System.out.println("NewData for key 10 : "+hm.get(10));
		
		//ordered.... all keys are sorted
		
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>(hm);
		System.out.println("TReeMap : "+tree);
	}

}
