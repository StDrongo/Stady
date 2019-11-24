package com.class10;

public class ArrayCountry {

	public static void main(String[] args) {

		/* Create an array of countries. 
		 * While retrieving all values from an array
		 * print capital for each country.
		 */
    String[] count= {"Belarus", "Russia", "USA", "Ukraine"};
	
	for (int a=0; a<count.length; a++) {
		
		if (count[a].equalsIgnoreCase("belarus")) {
			System.out.println("Capital of "+count[a]+" Minsk");
		}else if (count[a].equalsIgnoreCase("russia")) {
			System.out.println("Capital of "+count[a]+" Moscow");
		}else if (count[a].equalsIgnoreCase("usa")) {
			System.out.println("Capital of "+count[a]+" Washington DC");
		}else if (count[a].equalsIgnoreCase("ukraine")) {
			System.out.println("Capital of "+count[a]+" Kiev");
		}else {
		}	
		//another way
		
		String[] countries= {"Belarus", "Russia", "USA", "Ukraine"};
		
		for (int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {//switch Belarus
			case "Belarus":
				System.out.println("Minsk");
				break;
			case "Russia":
				System.out.println("Moskow");
				break;
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Ukraine":
				System.out.println("Kiev");
				break;
			}
			
		}
	}
	}
}
