package com.class17;

public class ObjectsOfComputer {

	public static void main(String[] args) {

	//String keyboard, monitor, mouse;
	//int ram, processor, HDD;
		
	Computer comp = new Computer();
		
		comp.keyboard = "Corsair";
		comp.monitor = "Asus";
		comp.mouse = true;
		comp.ram = 16;
		comp.processor = 2700;
		comp.HDD = 2000;
		
		System.out.println("Iam typing on "+comp.keyboard+" "
		+"and seeing result on "+comp.monitor);
		
		
		
		
		
		
	}

}
