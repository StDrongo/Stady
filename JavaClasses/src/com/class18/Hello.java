package com.class18;

public class Hello {

	public static void main(String[] args) {
		
		
		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("Russia");
	}
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	/* create a method that will say Hello in different
	 * language on the value that will be passed when
	 * user calls a method
	 */
	void sayHelloDifferentLanguage(String country) {
		
		switch(country.toLowerCase()) {
		case "USA":
			System.out.println("Hello");
		    break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("Hola");
			break;
		case "Albania":
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("I dont know this country");
		}
	}
	
	
	
	
}
