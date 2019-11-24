package com.class7;

import java.util.Scanner;

public class HomeWorkWhileDo {

	public static void main(String[] args) {

		/* Ask user to pay for a coffee
		 * keep asking to pay for it until
		 * entered price is equal =5;
		 * After then say "Enjoy your coffee!"
		 */
		boolean cash=true;
		int price=0;
		Scanner scan=new Scanner(System.in);
		
		while (cash) {
			System.out.println("Please pay for a coffee");
			price=scan.nextInt();
		if (cash&&price==5) {
			System.out.println("Enjoy your coffee");
			cash=false;
		}else {
			
		}
		}
	}
		
	}
