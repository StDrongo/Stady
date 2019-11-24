package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
		
	System.out.println("Enter your class day: ");
	String day=scanner.nextLine();
		
	if (day.trim().equalsIgnoreCase("saturday")) {
		System.out.println("Saturday is your Java Class");
	}else if(day.equals("sunday")) {
		System.out.println("Sunday is your Git Class");
	}else if(day.equals("tuseday")) {
		System.out.println("Tuseday is your SDLC Class");
	}else if(day.equals("thursday")) {
		System.out.println("Thursday is your Manual Testing Class");
	}else {
		System.err.println("Invalid Entry!! Please enter a valid class day");
	}
		scanner.close();
		
		
}

}
