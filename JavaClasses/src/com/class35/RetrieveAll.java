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
		
		//1st method of print. Line by line
		for (String key:keys) {
			System.out.println(key);
		}
		//2nd method of print. In array
		System.out.println(keys);
		System.out.println("---------------");
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		
		
		
		
	}
}
