package com.class26;

public class Degree {

	public void getDegree() {
		System.out.println("I got degree");
	}
		
}

class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am Undergraduate");
	}
}

class Postgraduate extends Degree {
	public void getDegree() {
		System.out.println("I am Postgraduate");
	}
	
	
	
	
}
