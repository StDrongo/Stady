package morePractice;

//Create a hashset contains below values. 
//first
//second
//third
//fourth 
//fifth 
//Create a logic to add the values of hashset to and array.
//print the values of array one by one. 
//Output:
//Array elements: 
//third 
//fifth 
//fourth 
//first 
//second







import java.util.*;
class Main {

	public static void main(String[] args) {
		
	HashSet<String> set = new HashSet<String>();
	
	set.add("first");
	set.add("second");
	set.add("third");
	set.add("fourth");
	set.add("fifth");
		
	String[] array = new String[set.size()];
    set.toArray(array);
    System.out.println("Array elements: ");
    for(String temp : array){
       System.out.println(temp);
    }
 	}
}
