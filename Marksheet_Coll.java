package com.test;

public class Marksheet_Coll {
String subject;
Float marks;

public Marksheet_Coll(String subject, Float marks) {
	super();
	this.subject = subject;
	this.marks = marks;
}

@Override
public String toString() {
	return "Marksheet_Coll [subject=" + subject + ", marks=" + marks + "]";
}

}
