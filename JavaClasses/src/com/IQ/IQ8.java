package com.IQ;

public class IQ8 {

	public static void main(String[] args) {

	//Write a program to print first 10 numbers of Fibonacci series
	//0+1=1+1=2+1=3+2=5+3=8+5=13+8=21+13=34	
		int a, b, c;
		a=0;
		b=1;
				
		for (int i=0; i<10; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}		
	}

}
