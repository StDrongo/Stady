package com.syntax.class4;

public class TriangleFor {

	public static void main(String[] args) {

//		1
//		13
//		135
//		1357
//		13579
		
//		for (int row=1; row<=5; row++) {
//			for (int col=1; col<=row; col++) {
//				System.out.print(2*col-1);
//			}System.out.println();
//		}
//	System.out.println("----------------------");	
	
//	     1
//	    12
//	   123
//	  1234
//	 12345
		
		for (int i=1; i<=5; i++) {
		
		for (int j=5-i; j>=1; j--) {
			System.out.print(" ");
		}
	    for (int m=1; m<=i; m++) {
	    	System.out.print(m);
	    }System.out.println();
	}
		
		
		
		
		
		
	}

}
