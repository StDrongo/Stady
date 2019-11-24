package com.class4;

public class Recap {

	public static void main(String[] args) {

		int num;
		num = 90;
		num -= 200;
		num -= 110;
		if (num > 0) {
			System.out.println(num + " is a positive number");

		} else {
			System.out.println(num + " is a negative number");
		}

		int i=134;
		
		if(i%2==0) {
			System.out.println(i+" is an even number");
		}else {
			System.out.println(i+" is an odd number");
		}
	    if (i%2!=0) {
	    	System.out.println(i+" is an odd number");
	    }else {
			System.out.println(i+" is an even number");
		}
	}

}
