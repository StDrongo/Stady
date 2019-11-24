package com.class2;

public class Variables {

	public static void main (String[] arg) {
		
		String name="Ilya";
		String lastName="Online";
		int grade=99;
		String city="NYC";
		String state="NYS";
		long phoneNumber=7184152547l;
		
		city="Washington DC";
	    state="DC";
		phoneNumber=457458748;
	    grade=88;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		//My name is___
		//I live in city of ___
		//My phone number is __
		
		String phone="My phone number is ";
		System.out.println("My name is " +name);
		System.out.println("I live is city of " +state);
		System.out.println(phone +phoneNumber);
		
		
	}
	
}
