package com.recap;
//to define our own data types
/*
 * Enum declaration can be done outside a claa
 * or inside a class but not inside a method
 * enum constant is always implicitly
 * public static final.Since it is static
 * we can access it by using enum name
 * enum cannot be used to create objects,
 * and it cannot extend other classes
 */
enum dept{
	Insurance,Training,Pitstop,Network;
	String display(){
		String msg = "You are working in "+this+"dept";
		return msg;
	}
}
public class Enum1 {
	enum month{
		//not mandatory to put semicolon
		January,Feburary,March,Apirl
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enum: "+dept.Insurance);
		dept c1[]=dept.values();
		for(dept j1:c1){
			System.out.println("Dept Datatypes: "+j1);
		}
		System.out.println("Enum method: "+dept.Pitstop.display());
		month m1;
		m1= month.January;
		
		switch(m1){
			case Feburary: System.out.println("Warm");
			break;
			case January: System.out.println("Winter");
			break;
			
			default:
				System.out.println("I dont know");
				break;
		}

	}

}
