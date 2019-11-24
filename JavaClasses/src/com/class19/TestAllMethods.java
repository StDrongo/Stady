package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
//find the largest number from 300 and 500
//then identify is the largest number is odd
	AllMethods obj=new AllMethods();
		int large=obj.findLargest(300, 500);
		System.out.println(large);
		
		boolean odd=obj.isOdd(large);
		System.out.println(odd);
		
		//call method weekdayname
		//if(tuesday,wednsday,thursday,
		//saturday,sunday)-> I am learning java
	String day=obj.weekDayName(5);
	if(day.equalsIgnoreCase("Tuesday")||
			day.equalsIgnoreCase("Thursday")||
			day.equalsIgnoreCase("Wednesday")||
			day.equalsIgnoreCase("Saturday")||
			day.equalsIgnoreCase("Sunday")) {
		System.out.println("Iam learning Java");
	}else {
		System.out.println("Iam doing some homework");
	}
	
		
		
	}

}
