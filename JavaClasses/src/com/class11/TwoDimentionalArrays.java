package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {

		//Declare 2D Array
		int [][] array=new int [3][5];
		
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3rd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=6;
		
		System.out.println(array[0][0]);
		
		//create 2D array of String with 2 rows and 3 columns
		String[][] str=new String[2][3];
		str[0][0]="one";
		str[0][1]="two";
		str[0][2]="tree";
		
		str[1][0]="four";
		str[1][1]="five";
		str[1][2]="six";
		System.out.println(str[1][2]);
	}

}
