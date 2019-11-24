package com.class11;

public class LoopsDemo {

	public static void main(String[] args) {

//		String[] cars= {"Toyota" , "BMW" , "Land Rover" , "Honda" , "MINI" , "Jaguar" };
//		for (String car : cars) {
//		    System.out.println(car);
		
//  String[] cars1= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
//	        
//  for(int i=0; i<cars1.length; i++) {
//	   System.out.println(cars1[i]);
//	        }
//	        
//	        
//	        
//	 //for each loop way:
//	 String[] cars2= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
//	 for(String element:cars2) {
//	     System.out.println(element);
//	        }
//	//Create an array on integers and calculate the sum of all elements in an array.
//     int [] num= {4,5,9};
//     int sum=0;
//     for (int i=0; i<num.length; i++) {
//         sum=sum+num[i];
//         System.out.println(sum);
//     }
//     System.out.println("************");
     int [] number= {9,2,4};
     int sumA=0;
     for (int n:number) {
         sumA=sumA+n;
         //System.out.println(sumA);
     }System.out.println(sumA);
	}

}
