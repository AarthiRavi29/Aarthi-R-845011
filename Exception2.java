package com.recap;

public class Exception2 {
static void throwExcp() throws IllegalAccessException
//throws is  must if u  have throw in your method orelse ur main method doesnt know abt
//the throw
{
	try{
		throw new IllegalAccessException("Going to method catch block");//exception thrown
	}
	//exception caught
	catch(IllegalAccessException e){
	System.out.println("catch block");
		System.out.println("Msg: "+e);
		throw new IllegalAccessException("Going to main method ");//exception thrown again
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("throw  & Throws Exception");
		try{
			throwExcp();
		}
		catch(Exception e){
			System.out.println("Exception caught: "+e);
		}

	}

}
