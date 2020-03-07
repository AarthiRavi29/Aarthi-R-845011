package com.test;

public class EmployeeBean {
String name;
int eno;
Address addr;
public EmployeeBean(String name, int eno, Address addr) {
	super();
	this.name = name;
	this.eno = eno;
	this.addr = addr;
}
void show(){
	System.out.println("Employee details:"+eno+" "+name);
	System.out.println(addr);
}
}
