package com.class12;

public class EmptyOrNotSrartWithAndEndWith {

	public static void main(String[] args) {

//		System.out.println("-----------------");
//		String str2="It is very hot in the class";
//		System.out.println("Is this string starts with= "
//		+str2.startsWith("It"));
		
		String str="";
		System.out.println(str.isEmpty());
		
		String str1="Hello";
		System.out.println(str1.isEmpty());
		
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.err.println("This is empty");
		}
		
		String sentence="Each day has a promise to brighten "
				+ "up the day, but first you must allow the sun";
		System.out.println(sentence);
		
	}

}
