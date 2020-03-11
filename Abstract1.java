package com.recap;
abstract class dum1{
	void check(){
		System.out.println("Abstract class contains only cocrete method");
	}
}
abstract class shopping1{
	//concrete method or non abstract method
	void feedback(){
		System.out.println("******");
	}
	//absract method cannot have body
	abstract void additem();
	abstract void delitem();
}

abstract class flipcart extends shopping1{
	void additem(){
		System.out.println("flipkart item added");
	}

}
 class amazon extends shopping1{
	void additem(){
		System.out.println("amazon item added");
	}
	void delitem(){
		System.out.println("amazon item deleted");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shopping a1=new shopping();//no object
		//flipkart f1=new flipkart();//no object
		amazon a1=new amazon();
		a1.additem();
		a1.delitem();
		a1.feedback();

	}

}
