package morePractice;
//Complete the Code. 
//Handle the possible Exception of Number format Exception. 
//in Catch block print the Exception Class using getClass method. 
//and print the message using getMessage method.
//Output
//class java.lang.NumberFormatException
//For input string: "akki"






class Main {
	  public static void main(String[] args) {
	    try {
	    int num = Integer.parseInt ("akki");
	  } catch(NumberFormatException e) {
		  System.out.println(e.getClass());
		  System.out.print(e.getMessage());
	  }
	}
}