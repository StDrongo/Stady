package com.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
         /* ask user to enter the month they were born
          * based on the month define the season
          * if user is born in jan, feb, dec -> winter
          * if march, apr, may -> spring
          * if jun, jul, aug -> summer
          * if sep, oct, nov - > fall
          * otehrwise - > unknown
          * at the end of the program
          * "you were born in ___"
          */
		
		String month=null;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Month of born");
		month=scan.nextLine();
		
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			month="Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			month="Spring";
		}else if (month.equals("June") || month.equals("Jule") || month.equals("August")) {
			month="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			month="Fall";
		}else {
			month="Unknown";
		}
		System.out.println("You were born in "+month);
	
	}

}
