package com.IQ;

public class IQ6 {

	public static void main(String[] args) {

	//Write a Java Program to find wether a String is palindrome
	//or not? If reversed string and original string are same
	// string is palindrome: racecar; mom; dad, madam; kayak, bob
	//Logic:
	//Step1: reverse the string
	//Step2: compare 2 Strings:
	//       if are equals -> palindrome
	//       else -> not palindrome
		
		String original="kayak";
		String reversed="";
		    //5-1=4-1=3-1
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k+a=ka+y=kay+
			
		}
		System.out.println(reversed);
		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
		
		
		
		
	}

}
