package com.example.shapes;

import java.util.Scanner;

public class Shapes {
	int sides;
	int length;
	public Shapes(int sides,int length){
		this.sides=sides;
		this.length=length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Shapes obj1=new Shapes(sc.nextInt(),sc.nextInt());
	calculateShapeArea(obj1.sides,obj1.length);
sc.close();
}
static void calculateShapeArea(int sides,int length){
		if(sides ==1){
			Circle obj2=new Circle();
		obj2.claculateArea(length);
		}
		else if(sides == 3){
			Triangle obj3=new Triangle();
			obj3.claculateArea(length);
		}
		else if(sides == 4){
			Square obj4=new Square();
			obj4.claculateArea(length);
		}
		else{
			System.out.println("Invalid Shapes");
		}}
}
