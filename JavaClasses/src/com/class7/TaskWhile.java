package com.class7;

public class TaskWhile {

	public static void main(String[] args) {

		/*
		 * Create a boolean workday true int =1
		 */
		boolean work = true;
		int a = 1;
		while (work) {
			
			if (a==6) {
				work=false;
			System.out.println("I do not need a day off");
			}else {
				System.out.println("I need a day off");
			}
		a++;
		}
	}
}
