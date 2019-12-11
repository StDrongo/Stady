package com.class33;

import java.util.ArrayList;
import java.util.List;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of drinks. 
		 * If any drink has letter “a” or “e” replace it with water. 
		 */
		
		List<String> drinks=new ArrayList<>();
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("cofee");
		drinks.add("tea");
		
		drinks.set(0, "water");
		System.out.println(drinks);
		
		for(int i=0; i<drinks.size();i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		
		System.out.println(drinks);
	}
}
