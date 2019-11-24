package com.class25_1;

public class CalculateArea {

	public void area(int a, int b) {
		System.out.println("Area of rectangle is "+(a*b));
	}
	
	public void area(int a) {
		System.out.println("Area of Square is "+(a*a));
	}
	
	public void area(int a, int b, int c) {
		System.out.println("Area of box is "+(a*b*c));
	}
	
	public static void main(String[] args) {
		
		CalculateArea obj = new CalculateArea();
		obj.area(15);
		obj.area(12, 14);
		obj.area(11, 17, 21);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
