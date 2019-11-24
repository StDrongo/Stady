package com.class25_1;

public class CanWeOverload {

	//can we overload a private method? -Yes
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	//can we overload a main method? - Yes
	//can we overload a static method? - Yes
	
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	
	public static void main (String str, String[] arg) {
		System.out.println("I am a main method with 2 parameters");
	}
	
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		CanWeOverload.main("String");
		String[] array= {"A", "B"};
		main("Hello", array);
	}
}