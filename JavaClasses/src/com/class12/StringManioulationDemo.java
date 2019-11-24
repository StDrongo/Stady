package com.class12;

public class StringManioulationDemo {

	public static void main(String[] args) {

		/*
		 * .coinains();
		 */
		
		String sentence="It was raining";
		String sen1="raining";
		System.err.println(sentence.contains(sen1));
		System.out.println(sentence.contains("rain"));
		System.out.println("---------------");
		String str="Hello World";
		String str1="Bye World";
		
		System.out.println(str.length());
		System.err.println(str1.length());
		System.out.println(str.equals(str1));
		System.out.println(str.contains("World"));
		System.out.println(str.toUpperCase());
		System.err.println(str1.toLowerCase());
		System.out.println(str.equalsIgnoreCase("HeLlO wOrLD"));
		/*
		 * str.length(); 
		 * str.equals(); 
		 * str.contains(s); 
		 * str.toUpperCase();
		 * str.toLowerCase(); 
		 * str.equalsIgnoreCase();
		 */
		
		
		
		
		
		
	}

}
