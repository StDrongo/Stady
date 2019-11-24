package com.class25;

public class Employee {

	public static String companyName;//accessible though the project
	int salary;//accessible within same package
	protected int employeeId;
	private String employeeSsn;//accessible within same class
	
	void work() {
		System.out.println("I work in " + companyName + " company");
	}

	protected void getPaid() {
		System.out.println("I get paid " + salary);
	}
}
