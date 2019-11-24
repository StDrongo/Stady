package com.class5;

import java.util.Scanner;

public class TaskAssigningToVariables {

	private static Scanner scan;

	public static void main(String[] args) {
       /* Write a program that will read three inputs of scores 
        * (quiz, mid term, and final scores) 
        * and determine the grade based on the following rules:
        * if the average score >=90 --> grade=A
        * if the average score >= 70 and <90 --> grade=B
        * if the average score>=50 and <70 --> grade=C
        * if the average score<50 --> grade=F
        */
       
		
		int quiz;
		int term;
		int finalScore;
				
		scan = new Scanner(System.in);
		System.out.println("Enter a quiz score");
		quiz = scan.nextInt();
		if (quiz<0) {
			System.out.println("Wrong number");
		}else {
		}
		System.out.println("Enter a term score");
		term = scan.nextInt();
		if (term<0) {
			System.out.println("Wrong number");
		}else {
		}
		System.out.println("Enter a final score");
		finalScore = scan.nextInt();
		if (finalScore<0) {
			System.out.println("Wrong number");
		}else {
		}
		int score=(quiz+term+finalScore)/3;
		
		String grade=scan.nextLine();
		if (score>=90 && score<=100) {
			grade = "A";
		}else if (score>=70 && score<90) {
			grade = "B";
		}else if (score>=50 && score<70) {
			grade = "C";
		}else if (score<50 && score>=0) {
			grade = "F";
		}else {
		}
		
		System.out.println("You average grade is "+grade);
	
		/* Write a program to determine the classMode.
        * If there is no rain --> classMode=“In Class”, 
        * otherwise classMode --> “Online”.
        */
		
		boolean isRain = true;
		if (!isRain) {
			System.out.println("In Class");
		}else {
			System.out.println("Online");
		}
	
	
	}
	
}

