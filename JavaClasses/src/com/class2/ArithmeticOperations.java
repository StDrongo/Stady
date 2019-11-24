package com.class2;

public class ArithmeticOperations {
/*
 * declare 2 variable and initialize them
 * perform addition, subtraction, multiplication and division
 */
	public static void main(String[] arg) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2); //30
		System.out.println(num1-num2); //10
		System.out.println(num1*num2); //200
		System.out.println(num1/num2); //2
		
		//how can we print value of num1 and num2 together
		System.out.println(num1+","+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
	    int mult=num1*num2;
	    int div=num1/num2;
	    //the addition of 2 numbers is ___
	    System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        
        System.out.println("The summary of 2 numbers is "+sum);
        System.out.println("The subtraction of 2 numbers is "+sub);
        String textMult="The multiplication of 2 numbers is ";
        System.out.println(textMult +mult);
        System.out.println("The division of 2 numbers is "+div);
        
    
	
	}
	
}
