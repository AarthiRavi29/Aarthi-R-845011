package com.test;

import java.util.Iterator;
import java.util.List;

public class Vendor_ColConstructor {
	int vid;
	String vendorname;
	List<String> cus_name;
	public Vendor_ColConstructor(int vid, String vendorname, List<String> cus_name) {
		super();
		this.vid = vid;
		this.vendorname = vendorname;
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