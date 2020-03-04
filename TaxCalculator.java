package com.example.tax;
import java.util.Scanner;
public class TaxCalculator {
	//float basicSalary;
	//boolean citizenship;
	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeTax obj1 = new EmployeeTax(sc.nextFloat(), sc.hasNext());
        System.out.println("The nett salary of the employee "+ deductTax(obj1.basicSalary,calculateTax(obj1.basicSalary)));
        
		System.out.println("The salary and citizenship eligibility: " + validateTax(obj1.basicSalary,obj1.citizenship));
        sc.close();	
	}
	static float calculateTax(float basicSalary){
		float tax = 30*basicSalary/100;
		System.out.println("The Tax of the employee  for  the " + basicSalary + " is " + tax);
		return tax;
	
	}
	static int deductTax(float basicSalary, float tax){
		float Salary=basicSalary-tax;
		int netSalary=(int)Salary;
		return netSalary;
	}
	static boolean validateTax(float basicSalary, boolean citizenship){
		if(basicSalary>=100000 && citizenship==true){
			return true;
		}
		else{
			return false;
		}
		
	}
}
