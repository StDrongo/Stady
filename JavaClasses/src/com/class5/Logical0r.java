package com.class5;

public class Logical0r {

	public static void main(String[] args) {

		/* 7 days a week 
		 * if days is 2 or 4 --> SDLC class
		 * if day 6 or 7 --> Java Class
		 * if day 1 or 5 --> No class
		 * if day =3 --> review class
		 */
		
		int day =6;
		
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		    //true OR false --> true
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		    //false OR false --> false
		}else if (day==1 || day==5 ) {
			System.out.println("No class");
		
		}else if (day==3) {
			System.out.println("Review Class");
		}
		/* 7 days a week 
		 * if days is Tuesday or Thursday --> SDLC class
		 * if day Saturday or Sunday --> Java Class
		 * if day Monday or Friday --> No class
		 * if day Wednesday --> review class
		 */
		
		String weekDay="Friday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println(("Not a valid day"));
		}
		
		
	}

}
