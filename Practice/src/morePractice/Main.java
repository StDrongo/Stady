package morePractice;

import java.util.Scanner;

//Create a final method. the final method should have no return type. What i want for you to do is in the final method create logic to reverse 2 numbers. 
//for instance a=12 and b =10. i want b to have the value of 12 and a to have the value of 10. 
//DO NOT REASSIGN the values, you must create logic where they both swap numbers
//THIS IS A SCANNER INPUT.
//Input: 
//12
//10
//Output:
//a is now assigned value of 10
//b is now assigned value of 12
public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	
	public final void method() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(b);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Main a = new Main();
		a.method();
		
	}
	
	
	
}
		
		

