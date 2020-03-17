package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Hibernate Annotation(NO XML):
 * Xml Metadata clubbed into Pojo File
 */
//No need of hbm.xml.File
@Entity
@Table(name="emp_annodemo12")
public class EmpPojo_Annotation {
@Column(name = "emp_no")
@Id
int Emp_num;

@Column(name = "ename")
String Emp_name;
@Column(name="esalary")
float Emp_salary;
public int getEmp_num() {
	return Emp_num;
}
public void setEmp_num(int emp_num) {
	Emp_num = emp_num;
}
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}
public float getEmp_salary() {
	return Emp_salary;
}
public void setEmp_salary(float emp_salary) {
	Emp_salary = emp_salary;
}



}
