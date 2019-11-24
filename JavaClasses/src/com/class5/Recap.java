package com.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner anyVariableName=new Scanner(System.in);
		
		System.out.println("Please enter boolean value");
		String val=anyVariableName.next();
				
		System.out.println("Please enter String value");
		boolean val1=anyVariableName.nextBoolean();
		
		System.out.println("Please enter String value");
		String val2=anyVariableName.nextLine();
		
		System.out.println("Please enter intiger value");
		int val3=anyVariableName.nextInt();
		
		System.out.println("Please enter double value");
		double val4=anyVariableName.nextDouble();
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}
	
	
}
