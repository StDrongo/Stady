package com.class36;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person {
//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. 
//In that map store personId and a Person Object. Print each object details.
	
	private String name, lastName;
	private int age, salary;
	
	Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public void display () {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
	
	
}
