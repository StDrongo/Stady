package com.class18;

public class Task2 {

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.palindrome("hello");//argument
		task.palindrome("madam");
	}
	void palindrome(String word) {
        String reverse = "";
        for (int i =word.length() - 1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
        } 
        
		if (word.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
    }
	
}
