package com.class20;

public class Task1 {
//	Create a method that will take 1 parameter as 
//	a String and return reversed String. 
//	Method should be visibly only within 
//	same package.
//	
//	Create a method that will take a String 
//	and return whether String is palindrome or not. 
//	Method should be available to all 
//	classes within your projects.
//	
//	Create a method that will take a string and 
//	return an array of words from that string. 
//	Method should be available only within 
//	same class.
public static void main(String[] args) {
	Task1 task = new Task1();
	
	String str = "Anna";
	
	String result = task.reverseString(str);
	System.out.println(result);
	
	boolean result2 = task.isPalindrome(str);
	System.out.println("Is \""+str+"\" Palindrome? "+result2);
	
	String [] arr = task.arr("What a beutiful day is today!");
	System.out.println("The length of the array is: "+arr.length);
	for (String word : arr) {
		System.out.println(word);
	}
	
	
}

    String[] arr(String str) {
//    	String[] stringArray = str.split(" ");
//    	return stringArray;
    	return str.split(" ");
    }

//palindrome String or not
public boolean isPalindrome(String str) {
    	boolean result = false;
    	String reverse = reverseString(str);
    	
    	if (str.equalsIgnoreCase(reverse)) {
    		result = true;
    	}else {
    		result=false;
    	}
    	
    	return result;
    }
//reversed String parameter
    String reverseString(String param) {
    	String result = "";
    	
    	char[] arr = param.toCharArray();
    	for (int i = arr.length-1; i>=0; i--) {
    		result+=arr[i];
    	}
    	return result;
    }
	
	
		
		
	
	
	
	
	
	
	
	
	
}
