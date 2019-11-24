package com.class4;

public class Task {

	public static void main(String[] args) {

		boolean diploma = false;
		double score = 44.64;

		if (diploma) {
			System.out.println("Congrats!");

			if (score >= 3.5) {
				System.out.println("You are eliglible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree");
		}
           System.out.println("-------------------");
		
		double rate=1;
		long price=20000;
		
		if (rate>4.5) {
		System.out.println("You cant buy a house");
		
		}else {
			System.out.println("You are consider to buy");
			if (price>200000) {
				System.out.println("You need to take a loan");
			}else {
				System.out.println("Pay cash");
			}
		}
	}

}
