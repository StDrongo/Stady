package com.Second.Classes;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter in first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter in second number: ");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
		//scan.close();
	}

}
