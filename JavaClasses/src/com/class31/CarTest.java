package com.class31;

public class CarTest {

	public static void main(String[] args) {
		Car a=new Truck();
		int carPrice=10000;
		int weight=7000;
		int lenght=70;
		System.out.println(a.calculateSalePrice());
		Car b=new Sedan();
		System.out.println(b.calculateSalePrice());
	}

}
