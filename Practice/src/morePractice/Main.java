package morePractice;

//Create A TreeMap of Integer, Double
//Add the below values
//1  1.1
//2  2.2
//3  3.3
//4  4.4
//5  5.5
//validate below and print the results 
//is Contain Key 3?
//is Contain Values 4.4?
//is Contain  key 6?






import java.util.*;

class Main {
    	
    	public static void main(String[] args) {
			
    	TreeMap<Integer, Double> val = new TreeMap<>();
    	val.put(1, 1.1);
    	val.put(2, 2.2);
    	val.put(3, 3.3);
    	val.put(4, 4.4);
    	val.put(5, 5.5);
    	
    	System.out.println(val.containsKey(3));
      System.out.println(val.containsValue(4.4));
      System.out.println(val.containsKey(6));

    	  	
    }
}