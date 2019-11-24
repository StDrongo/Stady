package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {

      int [] nums=new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
			//to find numbers of elements we use .length
		System.out.println(nums.length);
	
	    String[] array= {"Winter", "Fall", "Summer", "Spring"};
	    //I was born in Summer
	    System.out.println("I was born in "+array[2]);
	    System.out.println(array.length);
	    //array.length will return an integer
	    int arraySize=array.length;
	    System.out.println(arraySize);
	    
	    int [] score= {80, 90, 70, 100, 99};
	    
	}

}
