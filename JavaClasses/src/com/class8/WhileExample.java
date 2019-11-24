package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * lets adk to enter if it is raining or not as long as there is rain let's keep
		 * asking if no rain --> you can go to the park
		 */
		Scanner scan;
		boolean isRain;
		scan = new Scanner(System.in);

		do {
			System.out.println("Is it raining?");
			isRain = scan.nextBoolean();
		} while (!isRain);
		System.out.println("Stay at home");
	}
}
