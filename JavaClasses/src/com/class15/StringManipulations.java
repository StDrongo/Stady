package com.class15;

public class StringManipulations {

	public static void main(String[] args) {

		//string class
		//2 ways to create a String
		//first way using String literal
		String str="Hello";
		//second way using new keyword - creating a String object
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		
//1. find the number of characters inside the String 
//		.length();
//2. case conversion methods/functions
//      .toLowerCase();
//      .toUpperCase();
//3. verify if the String is Empty
//		.isEmpty();
      String myString1 = null;//no value at all it is equal to
      //String myString1;
      //System.out.println(myString1.isEmpty());
		
//4. how to verify existence of characters in the string
      String a="Good evening students";
      boolean exist=a.contains("students");
      System.out.println(exist);
      System.out.println(a.startsWith("Good"));
      System.out.println(a.endsWith("student"));
	
//5. get character at specific position
//   char.At();
      String str2="Syntax Technologies Inc";
      char letter=str2.charAt(5);
      System.out.println(letter);
      //length=19
      //System.out.println(str.charAt(str.length()));//outOfBound
      System.out.println(str2.charAt(str2.length()-1));
      String substr1=str.substring(0, 6);
      System.out.println(substr1);
      
      
      
	}

}
