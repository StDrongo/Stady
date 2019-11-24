package com.Second.Classes;

public class NEstedIfStatement {

	public static void main(String[] args) {
		
		boolean hasMoney=true;
		boolean isRestNear=true;
		
		if(hasMoney==true) {
			if(isRestNear) {
				System.out.println("I will eat in resturant");
			}else {
				System.out.println("Cant walk long distance");
			}
		}
		
		
	}
	
}
