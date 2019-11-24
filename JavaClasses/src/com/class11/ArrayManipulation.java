package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {

		String[] actualNames= {"Jhon", "Smith", "Alex", "Tanaz"};
		
		String[] expectedNames= {"Smith", "Jhon", "Alex", "Tanaz"};
		
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		
		
		System.out.println(actual.equals(expected));
		
		
		
		
	}

}
