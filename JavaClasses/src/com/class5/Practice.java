package com.class5;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 --> output “It is a weekday”, anyday from 6-7 --> output “It is
		 * a weekend”, any other day --> output “Invalid day”
		 */

		String day = "Sunday";

		if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wedesday") || day.equals("Thursday")
				|| day.equals("Friday")) {
			System.out.println("It is a weekday");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 5 feet) medium(5 to 6 feet)
		 * tall (6 feet and over)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Write yours height in feet");
		int height = scan.nextInt();

		if (height < 5 && height >1) {
			System.out.println("You are short");
		} else if (height == 5 && height < 6) {
			System.out.println("You are medium");
		} else if (height >= 6) {
			System.out.println("You are tall");
		}else {
			System.out.println("Invalid input");
		}

	}

}
