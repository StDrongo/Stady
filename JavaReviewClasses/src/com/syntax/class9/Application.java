package com.syntax.class9;

public class Application {

	public static void main(String[] args) {

		int[] arr = {5, 8, 2, 9, 3, 6};
		
		ArrayManipulation obj1 = new ArrayManipulation();
				
		int largest = obj1.largestNumber(arr);
		System.out.println(largest);
		
		int sum = obj1.SumOfArray(arr);
		System.out.println(sum);
		
		
	}

}
