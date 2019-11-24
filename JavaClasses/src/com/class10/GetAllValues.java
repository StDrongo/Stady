package com.class10;

public class GetAllValues {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Cow", "Snake", 
		"Elephant" };
		
		for (int i=0; i<animals.length; i++) {
		
			if (animals[i].equalsIgnoreCase("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
		
		
		
	}
}

