package com.class14;

public class Task {

	public static void main(String[] args) {

//		Create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces.
		
//		Create a String that should be combination of letters, 
//		numbers and special characters. Find out how many alpha 
//		characters are there in the String.
//		
//		You have a String a=”Is it saturday? 
//		Is it raining? Do we have a Java Class today?” 
//		How would you find out how many sentences are in that String?

		String str = "Today is sunday";
		System.out.println(str.replace(" ", ""));
		
		System.out.println("-------------");
		
		String str1="wkjn234(*&seg52";
		String str4=str1.replaceAll("[^A-z]", "");
		System.out.println(str4.length());
		System.out.println(str4);
		
		System.out.println("-------------------");
		
		String str2="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] str3=str2.split("\\?");
		for (int i = 0; i < str3.length; i++) {
			System.out.println(str3[i].trim());
		}
		
		
		
		
		
		
		
		
	}

}
