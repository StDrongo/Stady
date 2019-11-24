package com.class8;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		/*
		 * Create a program that will be asking 
		 * user to apply for a credit card 10 times
		 * As soon you get "yes" from a user 
		 * program should stop asking
		 */
		String card;
		Scanner scan = new Scanner(System.in);

		for (int q = 1; q <= 10; q++) {
			System.out.println("Are you apply to a credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("yes")) {
				break;
			}
		}
	}
}
