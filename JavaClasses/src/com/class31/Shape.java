package com.class31;

public interface Shape {
	
	double calculateArea(int radius);
	double calculatePerimiter(int radius);
	
	
}
class Circle implements Shape{
	double area;
	int perimeter;
	final double pi = 3.14;

	@Override
	public double calculateArea(int radius) {
		return pi * radius * radius;
	}

	@Override
	public double calculatePerimiter(int radius) {
		return 2 * pi * radius;
	}
}
