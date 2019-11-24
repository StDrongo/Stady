package com.syntax.class9;

public class ArrayManipulation {

	protected int largestNumber(int[] array) {
		
		int max = array[0];
		for (int element : array) {
			if (element > max) {
				max = element;
			}
		}
		return max;
		
		
	}
	public static int SumOfArray(int[] array) {
		int total = 0;
		for ( int element : array) {
			total = total+element;
		}
		
		
		return total;
	}
	
	
	
	
}
