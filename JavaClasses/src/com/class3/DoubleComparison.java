package com.class3;

public class DoubleComparison {

	public static void main(String[] args) {
	
		double a, b;
		a=18.12;
		b=15.29;
		
		if(a>b) {
			System.out.println("Double value "+a+" is larger than "+b);
		}else {
            System.out.println("Double value " +a+ " is smaller than " +b);
            
        }    
		
		 int storeTemp=35;
	        
	        if(storeTemp<32) {
	            System.out.println("Water will freeze with temperature "+ storeTemp);
	        }
	        else {
	            System.out.println("Water will NOT freeze with temperature "+ storeTemp);
	            }
	}
}


