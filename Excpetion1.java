package com.recap;

public class Excpetion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d,a;
try
{
	d=0;//if u want to check the result then give 2
	a=42/d;
	System.out.println("\n\t the result is "+a);
}
catch(Throwable e)
//catch(Exception e)
//catch(AirthmeticException e)
{
	System.out.println("Division by zero");
	System.out.println("Exception : "+e);
	System.out.println("Exception new : "+e.getMessage());
	e.printStackTrace();
}
//code enclosed within a finally block will always be executed
//(whether or not an exception occurs)

finally{
	System.out.println("After catch statement");
}
System.out.println("program continues...");
	}

}
