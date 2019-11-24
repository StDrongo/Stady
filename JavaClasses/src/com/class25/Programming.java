package com.class25;

public class Programming {
	
	public void Programming() {
		System.out.println("I love programming");		
	}
	public void Programming(String str) {
		System.out.println("I love "+str);
	}
	
	public static void main(String[] args) {
		
		Programming obj = new Programming();
		obj.Programming();
		obj.Programming("Java");
		obj.Programming(5);	
		
	}
	
	public void Programming(int i) {
		System.out.println(i);
	}
	
	
	
	
	
}
