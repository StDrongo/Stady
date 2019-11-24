package com.class10;

public class ArrayPractice {

	public static void main(String[] args) {

	/*
	* Create an array of chars and store grades into it: 
	* A,B,C,D,E,F. Then print a grade B 
	* (use 2 different ways of creating an array).
    * 
    * Create an array of names and store all names of your 
    * group. Then print your name from that array. 
    * (use 2 different ways of creating an array).
	* 
	* Create an array of words: Java, Saturday, day, coding, 
	* is. Print the following sentence using element 
	* of array: “Saturday is Java coding Day”.
	*/
		char[] grad=new char[6];
		grad[0]='A';
		grad[1]='B';
		grad[2]='C';
		grad[3]='D';
		grad[4]='E';
		grad[5]='F';
		System.out.println(grad[1]);
		
		char[] score= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(score[1]);
		
		String[] names=new String[5];
		names[0]="Yulia";
		names[1]="Diana";
		names[2]="Ilya";
		names[3]="Sasha";
		names[4]="Luda";
		System.out.println(names[1]);
		
		String[] name= {"Yulia", "Diana", "Ilya"};
		System.out.println(name[0]);
		
		String[] words= {"Java", "Saturday", "day", "coding", 
				"is"};
		System.out.println(words[1]+" " +words[4]+" "
		+words[0]+" "+words[3]+" " +words[2]);
		
		
		
		
		
		
	}

}
