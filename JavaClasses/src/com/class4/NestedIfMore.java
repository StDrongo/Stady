package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {

		/*
		 * check age, if age is less than 16 --> you are too young to drive otherwise
		 * --> you are eligible to drive & we will check if you are older than 18 -->
		 * you can get driver license and if you not you can get driver permit
		 */

		int age = 66;

		if (age < 16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are eligible to drive");
			if (age >= 18) {
				System.out.println("You can drive alone");
			} else {
				System.out.println("You need your parents to drive");
			}

		}
		System.out.println("------------------------------------");

		/*
		 * we need to check if student completed the quiz if yes --> good job, if not
		 * --> not good if they completed we will check score: if more than 90--> you
		 * got an A if more than 80--> you got a B anything below --> you should study
		 * more
		 * 
		 */
		boolean quiz = true;
		int score = 90;

		if (quiz) {
			System.out.println("Good job!!");

			if (score >= 90) {
				System.out.println("You are an A");
			} else if (score > 80) {
				System.out.println("You got a B");
			} else {
				System.out.println("You should study more");
			}

		} else {
			System.out.println("Not good!!!");
		}

	}
}
