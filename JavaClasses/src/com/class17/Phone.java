package com.class17;

public class Phone {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.brand="iPhone";
		phone1.color="Black";
		phone1.memory=8;
		phone1.name="XS";
		phone1.screen=6;
		phone1.touschScreen=true;
		
		
		Phone phone2 = new Phone();
		phone2.brand="Android";
		phone2.color="White";
		phone2.memory=16;
		phone2.name="MiMix3";
		phone2.screen=6;
		phone2.touschScreen=true;
		
		
		System.out.println("I have "+phone2.brand+" "
		+phone2.name+" "+" and i love it");
	    phone2.calls();
	    phone2.msg();
		
		
		
	}
	String brand, name, color;
	int memory, screen;
	boolean touschScreen;
	void calls() {
		System.out.println(brand+" can make a call");
	}
	
	void msg() {
		System.out.println(brand+" can send/recive a message");
	}
	
	
}
