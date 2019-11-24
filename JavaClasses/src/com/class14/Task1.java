package com.class14;

public class Task1 {

	public static void main(String[] args) {

//		Part 1: Programming Questions
//	1	Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
//		
//	2+	Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
//		
//	3+	Find out how many alpha characters present in a string?
//		
//	4+	How to find out the part of the string from a string? What is substring? Find number of words in string?
//		
//	5+	Write a java program to reverse String? Reverse a string word by word?
//		
//	6	Write a Java Program to find whether a String is palindrome or not?
//		
//	7	Write a java program to check whether a given number is prime or not?
//		
//	8+	Write a Java Program to print first 10 numbers of Fibonacci series.
		
//		int[] arr= {14, 23, 32, 41, 9, 12, 15, 6};
//		Arrays.sort(arr);
//		int lar=1;
//		
//	2	for (int i=0; i<arr.length-1; i++) {
//			if (arr[i]>lar) {
//				lar=arr[i];
//				
//			}
//		}System.out.println(lar);
		
//		String str="Wowiejrt239548)(*&)(8wwet";
//	3	String str1=str.replaceAll("[^A-z]", "");
//		System.out.println(str1.length());
		
//		String str = "Hello world!";
//        String reverse = "";
//   5     for (int i = str.length()-1; i>=0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        System.out.println("Reversed string is: " + reverse);
		
		String str = "world";
        String b = "";
        int len = str.length();
       for(int i = len - 1; i >= 0; i--)
       {
           b = b + str.charAt(i);
       }
       if(str.equalsIgnoreCase(b))
       {
           System.out.println("The string is palindrome.");
       }
       else
       {
           System.out.println("The string is not palindrome.");
       }
		
		
		
	}

}
