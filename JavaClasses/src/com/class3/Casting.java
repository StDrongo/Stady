package com.class3;

public class Casting {

	public static void main(String[] args) {
		
	//FYI - for your information
	/*
	 * Casting - changing/converting one type 
	 * to another type.
	 * Widening(Implicit/Automatic)
	 * byte-->short-->int-->long-->float-->double
	 * 
	 * 	 * Narrowing(Explicit/Manual)
	 * double-->float-->long-->int-->short--byte
	 *  
	 */
		//FYI - for your information
		//widening or automatic or implicit casting
		byte b=127;
		int i=b;
		int num=789;
		double d1=num;
		System.out.println(d1);
		System.out.println(i);
		
		//narrowing or explicit or manual casting
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);
	
	
	
	
	}
	
}
