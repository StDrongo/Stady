package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		//.split()
		//This method splits this string around matches of the 
		//given regular expression
		
		String str="Video provides a powerful way to "
				+ "help you prove your point";
		
		String[] array=str.split(" ");
		
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//How can we find how many sentences are in the folowing
		//string:
		System.out.println("------------------");
		
		String str1="Today is Sunday. Its sunny day. And "
				+ "we are have a java class";
		
		String[] array2 = str1.split("\\.");
		System.out.println(array2.length);
		
		for (String string : array2) {
			System.out.println(string.trim());	
		}
		

	}

}
