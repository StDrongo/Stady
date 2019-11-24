package com.class12;

public class SinlgeArrayRecapDemo {

	public static void main(String[] args) {

		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=15;
		
		int [] array2= {2,5,4,7};
		int num1=0;
		for (int i = 0; i < array2.length; i++) {
			
			num1=num1+array1[i];
			System.out.println(array2[i]);
		}
		System.out.println("The sum of array1 is "+num1);
		
		for(int i: array1) {
			System.out.println(i);
		}
		
	}

}
