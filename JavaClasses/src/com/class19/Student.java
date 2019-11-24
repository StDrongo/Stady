package com.class19;

public class Student {

	public static void main(String[] args) {
		
	}
	
	char getGrade (int i) {
		char grade;
		if (i>=90) {
		grade = 'A';
		}else if (i>=80&&i<90) {
			grade = 'B';
		}else if (i>=70&&i<80) {
			grade = 'C';
		}else if (i>=50&&i<70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}
	
	
	
	
	
}
