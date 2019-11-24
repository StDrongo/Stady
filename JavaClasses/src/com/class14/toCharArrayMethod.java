package com.class14;

public class toCharArrayMethod {

	public static void main(String[] args) {

		//.toCharArray
		//Convert String to a new character array.
		
		String str="Syntax";
		char[] array=str.toCharArray();
		
		for (char i:array) {
			System.out.print(i);
		}
		System.out.println();
		char b='w';
		char c='a';
		System.out.println(b+c);
		
		
		
	}

}
