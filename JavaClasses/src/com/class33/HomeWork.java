package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create an arraylist of cars and retrieve all the values using 3 different
		 * ways.
		 */
		ArrayList<String> car = new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		System.out.println("***********   first way  ************");
		for (String cars : car) {
			System.out.println(cars);
		}
		System.out.println("**************** Second way  *********");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		System.out.println("******************  Third way  **********");
		Iterator<String> it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}
}
