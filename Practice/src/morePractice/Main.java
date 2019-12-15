package morePractice;

//Create a method the return an LinkList. without parameters. 
//inside the method put the logic to add below values to the linklist and return the list. 
//In Main Class. 
//call the method and store it to a new Linklist. 
//Print the values of LinkList. 
//Output
//John
//Brian
//Ryan






import java.util.*;
class Main {
	
	public static void main(String[] args) {
		ArrayList <Boolean>listA = new ArrayList<Boolean>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList <Boolean>listB = new ArrayList<Boolean>();
		for (int i = 0; i <2 ; i ++) {
			for (int j = 0; j<listA.size(); j++) {
				listB.add(listA.get(j));
			}
		}
		
		System.out.println(listB);
	}
}
