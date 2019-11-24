package com.class23;

public class BetterCar {
	/* we want to build make as Toyota that will have different models and color *
	 */

	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}
	
	public static void main(String[] args) {
		make = "BMW";
		BetterCar bcar1 = new BetterCar("X5", "Blue",
				400, 2);
		bcar1.getDetails();
	}
	
	
	public void getDetails() {
		System.out.println("I build " + color + " " + make + " " + model);
		System.out.println("My car has "+doors+" doors and can have speed up to "+speed );
	}
}
