package com.recap;

import java.util.ArrayList;
import java.util.List;

public class LambdaExprs1 {

	interface building
	{
		//public void room1();//abstract method
		public void room();
		
		//default is given for non-abstract methos and it can be defined
		default void dummy(){
			System.out.println("Non abstract interface method");
		};
	}
	public interface My1{
		double getPi();
	}
	interface calc
	{
		public int add(int a,int b);
		default float sub(int a,float b){
			return a-b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//without lambda using anonymous class
		//no implements
		building d=new building(){
			public void room(){
				System.out.println("3500SQFT");
			}
		};
		building d1 = new building(){
			public void room(){
				System.out.println("53500SQFT");
			}
		};
		d.room();
		d1.room();
		
		//jdk 1.8 or above
		//with lambda but Zero arguments
		//no separate.class file for interface
		//it will use all interface with one class by using lambda
		
		building d2=()->
		{
			System.out.println("Lambda-4000SQFT");
		};
		d2.room();
		
		My1 m=()->3*3.1415;
		System.out.println("Value of Pi = "+m.getPi());
		
		//Multiple parameters in lambda expression
		//without return keyword
		//datatypes are optional
		//calc ad1=(a,b)->(a+b); //valid
		
		calc ad1=(int a,int b)->(a+b);//valid
		System.out.println("Add: "+ad1.add(10, 20));
		System.out.println("Sub: "+ad1.sub(34, 4.0f));
		
		List<String> dept=new ArrayList<String>();
		dept.add("Finance");
		dept.add("Insurance");
		dept.add("Admin");
		dept.forEach((n)->System.out.println(n));
		
	}

}
