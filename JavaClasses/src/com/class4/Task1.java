package com.class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Write a Fahrenheit temperature");
		double temp = scan.nextInt();

		System.out.println("Write a city");
		String city = scan.next();//not a scan.nextLine
		
		double cels;
		cels = (temp - 32) * 5 / 9;

		System.out.println("The temperature is the city " + city + " is " + cels + " celsium");

	}
}
