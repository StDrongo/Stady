package com.syntax.class6;

public class subStringDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, "
				+ "because today is not Monday.";
        String anotherStr = longStr.substring(10);
        System.out.println(anotherStr);
                
        anotherStr = longStr.substring(10, 15);
        System.out.println(anotherStr);
        
//      System.out.println(longStr.substring(20, 10));
//      longStr.substring(10, 56);
	}

}
