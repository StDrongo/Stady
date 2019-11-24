package com.syntax.class5;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("hello"));
		System.out.println(str.contains("ll"));
		System.out.println(str.substring(2));
		System.out.println("--------------");
		String b = "LL";
		String c = b.toLowerCase();
		str.toLowerCase().contains(c);
		boolean result1 = str.startsWith("he");
		System.out.println(result1);
		boolean result2 = str.startsWith("ll", 2);
		System.out.println(result2);
		String d = "ll";
		System.out.println(str.endsWith(d));
		String str2 = "";
		System.out.println("Empty: " + str2.isEmpty());
		System.out.println("--------------------------");
		String str1 = str + " " + "World";
		String str3 = str.concat(" ").concat("World  ").trim().concat("Bodies");
		String str4 = str.concat(" ").concat("World  ").concat("Bodies");
		System.out.println(str1);
		System.out.println("++++++++++++++++");
		char result = str.charAt(3);
		System.out.println(result);
		String newStr = "" + str.charAt(0) + str.charAt(2) + str.charAt(4);
		System.out.println(newStr);

		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("l"));

		String str5 = "klmhjnpot";
		System.out.println(str5.indexOf("h", 5));
		System.out.println(str5.indexOf("j"));
	}
}