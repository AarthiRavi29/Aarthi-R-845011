package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Stud_CollectionRef {
String name;
String Standard;
Map<Marksheet_Coll,Marksheet_Coll> result;


public Stud_CollectionRef(String name, String standard, Map<Marksheet_Coll, Marksheet_Coll> result) {
	super();
	this.name = name;
	this.Standard = standard;
	this.result = result;
}


public void display(){
	System.out.println(name+" "+Standard);
	Set<Entry<Marksheet_Coll, Marksheet_Coll>> set=result.entrySet();
	Iterator<Entry<Marksheet_Coll, Marksheet_Coll>>itr=set.iterator();
	while(itr.hasNext()){
		Entry<Marksheet_Coll, Marksheet_Coll> entry=itr.next();
		System.out.println("Subject: "+entry.getKey()+"Mark: "+entry.getValue());
	}
}
}

