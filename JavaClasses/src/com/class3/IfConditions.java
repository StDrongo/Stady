package com.class3;

public class IfConditions {

	public static void main(String[] args) {

	double teaPrice=4.99;
	double allowedPrice=5.99;
		
	//if price is more - NOT buy
	//if less - I will
	
	if(allowedPrice>=teaPrice) {
		System.out.println("I will buy tea");
	    System.out.println("And I will enjoy my tea");
	}else {
		System.out.println("I cannot afford, I need to study more");
		System.out.println("I will go back to study more");
	}
	
		System.out.println("I keep writing some code");
        System.out.println("I keep writing more code");
	


	boolean isRain=false;
	//if its raining I will take umbrella, otherwise I go for a walk
	
	if(isRain) {//isRain==true
		System.out.println("I will take umbrella");
	}else {
		System.out.println("I go for a walk");
	}
	
	}
	
	
	
}
