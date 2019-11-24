package com.class8;

public class BreakAndCondition {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Iam outside");

		
		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				continue;
		}
			System.out.println(i);
		}
		System.out.println("Iam outside");
	}

}
