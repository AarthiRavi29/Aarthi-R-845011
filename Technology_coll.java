package com.test;

public class Technology_coll {
String tech_name;
String assessment;
public String getTech_name() {
	return tech_name;
}
public void setTech_name(String tech_name) {
	this.tech_name = tech_name;
}
public String getAssessment() {
	return assessment;
}
public void setAssessment(String assessment) {
	this.assessment = assessment;
}
@Override
public String toString() {
	return "Technology_coll [tech_name=" + tech_name + ", assessment=" + assessment + "]";
}
}
