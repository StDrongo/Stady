package com.syntax.class5;

public class Sum2DArray {
	public static void main(String[] args) {

		int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 }, { 3, 5, 1 } };

		int sum = 0;
		int row = 3;
		for (int k = 0; k < b[row].length; k++) {
			sum += b[row][k];
		}
		System.out.println("sum in row " + row + " is " + sum);
	}
}

//int sum = 0;
//for (int i = 0; i < b.length; i++) {
//  for (int k = 0; k < b[i].length; k++) {
//      sum += b[i][k];
//  }
//}
//System.out.println("sum in all rows is " + sum);