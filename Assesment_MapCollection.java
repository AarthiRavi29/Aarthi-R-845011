package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assesment_MapCollection {
String sid;
String Sname;
Map<String, String> test_details;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public Map<String, String> getTest_details() {
	return test_details;
}
public void setTest_details(Map<String, String> test_details) {
	this.test_details = test_details;
}
void display(){
	System.out.println("Sid: "+sid);
	System.out.println("Sname: "+Sname);
	Set<Entry<String, String>> set=test_details.entrySet();
	Iterator<Entry<String, String>>itr=set.iterator();
	while(itr.hasNext()){
		Entry<String, String> entry=itr.next();
		System.out.println("Test_List: "+entry.getKey()+"Attended: "+entry.getValue());
	}
	
}
}
