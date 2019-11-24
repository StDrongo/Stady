package com.class12;

public class StringMiniPulationDemo {

	public static void main(String[] args) {

		String name="Jhon";
//		System.out.println(name);
//		System.out.println(name.length());
		
		//2
		//Creating String with new key word
		String name1=new String("John1");
		//System.out.println(name1);
		
		/* This method returns the length of this string.
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		
		int name1Len=name1.length();
		System.out.println("The length of name1Len is= "+name1Len);
		
		System.out.println("++++++++++++++");
		
		String str1="Hello world";
		System.out.println("Before= "+str1);
		str1=str1.toLowerCase();
		System.out.println("After= "+str1);
		
		//.equals()
		String str2="HELlo WoRld";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//This method will convert all of the 
		//characters in String with upper case
		
		String str3="MoHaMmad";
		System.out.println("Before= "+str3);
		str3=str3.toUpperCase();
		System.out.println("After= "+str3);

		
		
		
	}

}
