package com.syntax.class8;

public class Application {
	public static void main(String[] args) {
		MathOperations mathOps = new MathOperations();
		
		
		mathOps.add(12, 15);
		
		int res = mathOps.add2(12, 15);
		
		System.out.println(res);
		

		
	}
}