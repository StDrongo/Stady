package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("John");
		stringList.add("Ak");

		// remove names that are shorter that 4 character
		stringList.remove(2);
		System.out.println(stringList);
		//removing element using for loop
		//size=7,7,6
		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() <=4) {
				stringList.remove(i);
			}
		}

		System.out.println(stringList);

		//best way to remove an element from a collection --> Iterator
		List<String> stringList1 = new ArrayList<>();
		stringList1.add("Hasan");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("John");
		stringList1.add("Ak");
		Iterator<String> it=stringList1.iterator();
		while(it.hasNext()) {
			if (it.next().length()<4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
	}
}
