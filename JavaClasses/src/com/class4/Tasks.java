package com.class4;

public class Tasks {

	public static void main(String[] args) {

		boolean diploma = true;
        double score = 2.5;
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
     
}

}