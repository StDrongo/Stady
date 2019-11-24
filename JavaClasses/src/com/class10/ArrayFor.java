package com.class10;

public class ArrayFor {

	public static void main(String[] args) {

	//   0	 1	   2    3    4    5
			char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
			
			int a=2;
			System.out.println(grades[4]);
			System.out.println(grades[a]);
			
			a+=2;//2+2
			System.out.println(grades[a]);
			a--;//3
			System.out.println(grades[a]);
			System.out.println("--------------------");
//			System.out.println(grades[0]);
//			System.out.println(grades[1]);
//			System.out.println(grades[2]);
//			System.out.println(grades[3]);
			
			for(int i=0; i<grades.length; i++) {
				System.out.println(grades[i]);
		
		
		String[] animals = { "Cat", "Dog", "Cow", "Snake", 
				"Elephant" };
		int size = animals.length;
		for (int d = 0; d < size; d++) {
			System.out.print(animals[d] + " ");
			System.out.println();

			double[] num = { 1.1, 2.1, 3.1, 4.1 };
			for (int c = 0; c < num.length; c++) {
				System.out.print(num[c] + " ");
			}

		}
	}
}
}