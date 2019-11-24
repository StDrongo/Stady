package com.class6;

public class Homework {

	public static void main(String[] args) {

		/* declare the time (1-24)
		 * based on the time identify whether it morning, afternoon, evening or night
		 * if 1-11 -> morning
		 * if 12-15 -> noon
		 * if 16-20 -> evening
		 * if >20 -> night
		 */
		
		int time=34;
		String timeOfDay=null;
		
		if (time>=1 &&time <=11) {
			timeOfDay="Morning";
	    }else if (time>=12 && time<=15) {
            timeOfDay="Mprning";
	    }else if (time >=16 && time <=20) {
	    	timeOfDay="Evening";
	    }else if (time>20 && time<=24) {
	    	timeOfDay="Night";
	    }else {
	    	timeOfDay="Invalid";
	    }
		System.out.println(timeOfDay);
		
		if (timeOfDay.equals("Morning")) {
				System.out.println("Good morning");
	}
         System.out.println("Time of the day is "+timeOfDay);
}
}