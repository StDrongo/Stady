package com.class24;

public class ThisWithConstractor {

	ThisWithConstractor() {
      	System.out.println("I am non argument constractor");
	}
	ThisWithConstractor(String str) {
		this();//used to call current class constructor
		System.out.println("I am constractor with 1 String param");
	}
	
	ThisWithConstractor(String str, String str1) {
		this("Hello");
		System.out.println("I am construsctor with 2 param");
	}
	
	public static void main(String[] args) {
		
	ThisWithConstractor obj = new ThisWithConstractor("Hello");
	//can we execute 2 constructors at the same time
	// yes - it can be achieved using 'this()' keyword
	//this type of constructor calls is know as CONSTRUCTOR
	
	ThisWithConstractor obj1 = new ThisWithConstractor("Hello", "Bye");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
