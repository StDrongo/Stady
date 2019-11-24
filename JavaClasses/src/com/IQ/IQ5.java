package com.IQ;

public class IQ5 {

	public static void main(String[] args) {

		// Write a java program to reverse String?
		// Revers a String word by word?

		String given = "Welcome to the Java Class";
		// to reverse
		// Step1: split --> array of String
		// Step2: use for loop and use decrement to print value
		//
		String reversed = "";
		String[] str = given.split("\\s");
		for (int i = str.length - 1; i >= 0; i--) {
			reversed = reversed + str[i] + " ";
			System.out.println(str[i]);
		}
		System.out.println(reversed);

		// Write a java program to reverse String
		// toCharArray(); charAt();
		//

		String given1 = "Today is Java Class";
		char[] charArray = given1.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		String word = "I love java";
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}

	}

}
