package com.class21;

public class Task {

//	1. CreateaClasscalledEmployee:
//		● Create three variables eID , salary
//		and set the CEO to “Sumair”
//		● Create two objects of the class
//		Employee
//		● Set the value of eID, salary for each of
//		the objects
//		● Print out the eID , salary and CEO for
//		each of the objects
	
	String eID;
	int salary;
	static String CEO;
	
	void display() {
		System.out.println(eID+ " student "
	+ " his salary "+salary+" and CEO is "+CEO);
	}
	public static void main(String[] args) {
		Task.CEO = "Sumair";
		Task employee1 = new Task();
	    employee1.display();
		employee1.eID = "Eric";
		employee1.salary = 140;
//		Task.CEO = "Sumair";
		employee1.display();
		
		Task employee2 = new Task();
		employee2.eID = "John";
		employee2.salary = 170;
//		Task.CEO = "Sumair";
		employee2.display();
		
//		Task employee1 = new Task();
//		employee1.eID = "John";
//		employee1.salary = 150;
//		employee1.display();
//		employee1.CEO = "Asel";
//		employee1.display();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
