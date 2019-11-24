package com.class18;

public class Task {

	public static void main(String[] args) {
		Task a = new Task();
		a.num(23, 74);
	}
	void num (int i, int j) {
		if (i>j) {
			System.out.println(i+ " is grater than "+j);
		} else {
			System.out.println(j+" is grater than "+i);
		}
	}
	
	

}