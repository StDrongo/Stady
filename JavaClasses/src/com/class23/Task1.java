package com.class23;

public class Task1 {

//	Write a program that will have a constructor: one with parameters and second without any parameters. Create a separate Test class where you will execute both 
//	of the constructors.
//
//	Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
    static String str = "First";
    static String str1 = "Second";
	
	Task1 () {
		System.out.println("Constractor without any parameters");
	}
	
	Task1 (String str, String str1) {
		System.out.println("Constructor with two parameters");
	}
	public static void main(String[] args) {
		
		Task1 obj = new Task1(str, str1);
	    Task1 obj1 = new Task1();
		
		
		
		
		
	}
	
	
	
	
}
