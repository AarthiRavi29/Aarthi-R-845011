package com.test;

import java.util.Iterator;
import java.util.List;

public class Vendor_Collection {
int vid;
String vendorname;
List<String> cus_name;
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getVendorname() {
	return vendorname;
}
public void setVendorname(String vendorname) {
	this.vendorname = vendorname;
}
public List<String> getCus_name() {
	return cus_name;
}
public void setCus_name(List<String> cus_name) {
	this.cus_name = cus_name;
}
public void displayInfo(){
	System.out.println(vid+" "+vendorname);
	System.out.println("Customers Are:");
	Iterator<String>itr=cus_name.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
