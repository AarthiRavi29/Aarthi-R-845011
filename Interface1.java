package com.recap;
class herit{
	void go(){
		System.out.println("CLASS GO() METHOD");
	}
}
interface a{
   void dis();
}
interface b{
	void dis1();
}
interface c extends a,b{
	void dis2();
}
//class implement more than one interface
//interface can extends more than one interface
//first extends then implements
public class Interface1 extends herit implements Shopping,c {

	@Override
	public void additem() {
		// TODO Auto-generated method stub
System.out.println("Add Item Interface method");
	}

	@Override
	public String view(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}

	@Override
	public void dummy() {
		// TODO Auto-generated method stub
//interface must defined in the implemented class bt no need for business logic
	}
//class method
	public void msg(){
		System.out.println("Dont Sleep********Conditions Apply");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interface1 s1 =new Interface1();
s1.additem();
System.out.println(s1.view("Shopping Done"));
s1.dis2();
s1.dis();
s1.dis1();
s1.msg();
//a obj1=new a();//interface cannot be instantiated
//runtime polymorphism
//a obj1=new Interface1();
	}

	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		System.out.println("C Interface method");
	}


	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		System.out.println("A interface method");
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		
	}

}
