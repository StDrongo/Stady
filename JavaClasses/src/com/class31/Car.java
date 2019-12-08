package com.class31;

public class Car {
	public double carPrice;
	public String color;
	public double withDiscount;
	public double calculateSalePrice() {
		return withDiscount;
	}
}class Sedan extends Car{
	int lenght;
		public double calculateSalePrice() {
		if(lenght>20) {
			double withDiscount=carPrice*0.95;
		}if(lenght<=20) {
			double withDiscount=carPrice*0.90;}
			return withDiscount;
}}
class Truck extends Car{
	double weight;
	public double calculateSalePrice() {
		//this.weight=weight;
		this.carPrice=carPrice;
		if(weight>2000) {			
			double withDiscount=carPrice*0.9;
		}if(weight<2000) {
			double withDiscount=carPrice*0.8;}
			return withDiscount;
		}
}