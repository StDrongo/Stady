package com.class35;

import java.util.*;

public class RetrieveAll {
	public static void main(String[] args) {
		
		Map<String, String> personMap = new LinkedHashMap<>();
		
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yuldiz");
		personMap.put("Adress", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		System.out.println(personMap);
		Set<String> keys = personMap.keySet();
		
		//1st method of print "key". Line by line
		for (String key:keys) {
			System.out.println(key);
		}
		//2nd method of print "key". In array
		System.out.println(keys);
		System.out.println("---------------");
		//3rd method of print "key". Line by line
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("-------------");
		Collection<String> values = personMap.values();
		//1st method of print "value" line by line.
		for(String val:values) {
			System.out.println(val);
		}
		//2nd method of print "value" line by line
		Iterator<String> valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		
	}
}
