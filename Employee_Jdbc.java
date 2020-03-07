package com.test;

public class Employee_Jdbc {
	//name same as db column name
	int emp_no;
	String emp_name;
	float salary;
	public final int getEmp_no() {
		return emp_no;
	}
	public final void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public final String getEmp_name() {
		return emp_name;
	}
	public final void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public final float getSalary() {
		return salary;
	}
	public final void setSalary(float salary) {
		this.salary = salary;
	}
}
