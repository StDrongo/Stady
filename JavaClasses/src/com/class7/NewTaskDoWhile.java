package com.class7;

import java.util.Scanner;

public class NewTaskDoWhile {

	public static void main(String[] args) {

		/* ask user to enter name 5 times
		 * and our output should be "Good afternoon ___"
		 */
		Scanner scan = new Scanner(System.in);
				int i = 5;
		
		while (i<10) {
			System.out.println("Please enter your nasme");
		String name = scan.nextLine();
		System.out.println("Good afternoon "+name);
		i++;
		}
	}
}
