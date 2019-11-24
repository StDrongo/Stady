package com.class2;

public class Task {
    
	/*
	 * Write a Java program to add, subtract, multiply and 
	 * divide 2 decimal values. Your program should say. 
	 * “The _______ of 2 numbers ___ and ___ is equal to _____”

Write a program to find the square of the number 3.9. 
You program should say “The square of the ____ is ____ “
Write a program to print the area and perimeter of a 
rectangle with width = 5 and  height = 8. Your program should say. 
“The perimeter of a rectangle with width ___ and height ____ is equal 
to _____ and the area is __”
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		num1=10;
		num2=22;
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println("The summary of 2 numbers "+num1+" and "+num2+"is equal to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+"is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+"is equal to "+mult);	
		System.out.println("The division of 2 numbers "+num1+" and "+num2+"is equal to "+div);
		
		double num3=3.9;
		
		System.out.println("The square of the "+num3+" is "+num3*num3);
		
		byte b1=5;
		byte b2=8;
		
		System.out.println("The perimeter of a rectangle with width "+b1+" and height "+b2+" is equal to "+(b1+b2)*2);
		
		
	}
	
}
