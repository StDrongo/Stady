package com.class4;

import java.util.Scanner;

public class ScannerHome {

	public static void main(String[] args) {
		
		  Scanner scan= new Scanner(System.in);
		  System.out.println("Please Enter First Name");
		  String name=scan.nextLine();
		  System.out.println("Please Enter Surname");
		  String surname=scan.nextLine();

          System.out.println(name+" "+surname);

	}
	
	
	
}
