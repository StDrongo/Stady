package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		//to store values inside you collection
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		//to retrieve the value from arraylist
		System.out.println(arrayList.get(1));
		
		//add more values
		arrayList.add("James");
		arrayList.add("John");
		arrayList.add("Jane");
		
		//how many elements inside the arrayList?
		int size=arrayList.size();
		System.out.println(size);
		
		//creating an Object of ArrayList that will hold numberic values
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		int y=numArrList.get(0);
		
		//update the value
		numArrList.set(0, 1000);
		System.out.println(numArrList);
		
		//retrieving values
		System.out.println(numArrList.get(2));
		//int num=control or counter --> controls # of iterations for the loop
		for(int num=0; num<numArrList.size(); num++) {
			
			Integer myInteger=numArrList.get(num);
		}
		
		for(Integer number:numArrList) {
			System.out.println(number);
		}	
	}
}