package com.class4;

public class NMestedIfPractice {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 13;

		// if today is friday

		if (isFriday) {
			System.out.println("Today is Friday");

			if (day == 13) {
				System.out.println("I will watch scary movie");
			}

		} else {
			System.out.println("Today is NOT Friday");
		}
	}

}
