package com.class13;

public class RegularExpressions {

public static void main(String[] args) {
/*
 * print only text and not numbers
 */
		
		String str="14234Hel45645lo465456";//Hello
		
		System.out.println("=====================");
		
		System.out.println(str.replaceAll("[0-9]", ""));//Leave only text
		System.out.println("=====================");

		System.out.println(str.replaceAll("[a-zA-Z]", ""));//Leave only numbers 1423445645465456
		System.out.println("=====================");

		//Remove everything except text and numbers
		String str2="Hi#$%How#$%#$4356346";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println("=====================");

		System.out.println(str2.replaceAll("\\w", ""));
		
		
		
	}

}