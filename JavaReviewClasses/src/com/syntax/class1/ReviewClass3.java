package com.syntax.class1;

import java.util.Scanner;

public class ReviewClass3 {

	public static void main(String[] args) {

		/* Write a program with one int value for 
		*  salary and four String values for different cars
        *  If you make over 50000 a year, you may buy 
		*  a brand new car otherwise you should buy a used car. 
		*  For those you can afford a new car there are 
		*  different price ranges
        *  I want anything under 70k to be Audi A5
        *  I want anything under 80k to be Mercedes-Benz
        *  I want anything under 90k to be Jaguar
        *  I want anything under 100k to be Tesla
        *  And if you make less than 60k output to read 
		*  "Save up money and wait until next year"
		*/
		int sal;
				
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("What is you salary?");
		sal=sc.nextInt();
		  if (sal>=60000) {
			  System.out.println("You can buy a brand new car");
			  if (sal>=70000) {
				  System.out.println("You can buy a Audi");
			  }else if (sal>=80000) {
				  System.out.println("You can buy a Mercedes-Benz");
			  }else if (sal>=90000) {
				  System.out.println("You can buy a Jaguar");
			  }else if (sal>=100000) {
				  System.out.println("You can buy a Tesla");
			  }
		  }else {
			  System.out.println("Save up money and wait until next year");
		  }
	}
}
