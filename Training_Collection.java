package com.test;

import java.util.Iterator;
import java.util.List;

public class Training_Collection {
int batchno;
String projname;
List<Technology_coll>tc1;//3rd party object
public int getBatchno() {
	return batchno;
}
public void setBatchno(int batchno) {
	this.batchno = batchno;
}
public String getProjname() {
	return projname;
}
public void setProjname(String projname) {
	this.projname = projname;
}
public List<Technology_coll> getTc1() {
	return tc1;
}
public void setTc1(List<Technology_coll> tc1) {
	this.tc1 = tc1;
}
public void display(){
	System.out.println(batchno+" "+projname);
	Iterator<Technology_coll>itr=tc1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
