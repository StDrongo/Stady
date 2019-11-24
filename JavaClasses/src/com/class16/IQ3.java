package com.class16;

public class IQ3 {

	public static void main(String[] args) {

		//how many alpha characters present in a String?
		
		String str="Hello 346346 *&^*%, welcomewelrgimw!!!!";
		
		str=str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(str.length());
		
		
		
	}

}
