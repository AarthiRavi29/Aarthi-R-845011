package com.recap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Object> hs = new HashSet<Object>();
     //Set hs = HashSet();//valid
     //unordered
     hs.add(244);
     hs.add(new Integer(2));
     hs.add(new Integer(4));
     hs.add(new Integer("2"));
     hs.add(new Float("43.654"));
     hs.add(new String("Aarthi"));
     System.out.println("HashSet contains: "+hs);
     System.out.println("Size of Hashset: "+hs.size());
     System.out.println("Is HashSet empty: "+hs.isEmpty());
     //no dublicates
     Iterator itr = hs.iterator();
      System.out.println("Hashset Contains : ");
      while(itr.hasNext())
    	  System.out.println(itr.next());
	}

}
