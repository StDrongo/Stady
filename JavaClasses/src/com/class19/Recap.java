package com.class19;

public class Recap {

	public static void main (String[] args) {
        Recap obj=new Recap();
        obj.sum(10, 30);
        System.out.println("------------");  
      obj.sayHello(2);
		obj.saySomething("Bye", 3);
		
	}
	
	//method t oreturn largest number
	int findLargest(int num1, int num2) {
		int largest;
		if (num1>num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}
	void sayHello(int times) {
		for (int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}
	void saySomething (String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
    void sum(int num1, int num2) {
	   int c = num1+num2;
 System.out.println("The sum of 2 numbers is: "+c);
	}
	//return type, method name(list of parameters
	int sum1(int num1, int num2) {
		int c=num1+num2;
		return c;
	}
}
