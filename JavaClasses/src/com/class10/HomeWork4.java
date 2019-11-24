package com.class10;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {

		Scanner scan;
		int secretNumber, guessNumber;
		
		scan = new Scanner (System.in);
		secretNumber=12;
		
		do {
			System.out.println("Please guess my number "
					+ "from 1 to 20");
		    guessNumber=scan.nextInt();
		    
		    if (guessNumber<secretNumber) {
		    	System.out.println("Your number is too "
		    			+ "small than mine");
		    }else if (guessNumber>secretNumber) {
		    	System.out.println("Your number is too large");
		    }else {
		    	System.out.println("Congratulations you got it");
		    }
		}while (guessNumber!=secretNumber);
		
		
		
	}

}
