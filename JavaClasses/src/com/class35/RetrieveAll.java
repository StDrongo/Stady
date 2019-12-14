package com.class35;

import java.util.Map.*;
import java.util.*;

public class RetrieveAll {

	public static void main(String[] args) {
		//Lets create a map of a classroom in which we will store objects and it's quantities
		
		Map<String, Integer> classRoom=new HashMap<>();
		
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		
		System.out.println(classRoom);
		
		Set<Entry<String, Integer>> entrySet=classRoom.entrySet();
		
		System.out.println("---------using for each loop to get all entry objects");
		
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("---------using iterator to get all entry objects");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+"----"+ent.getValue();
			System.out.println(entry);
		}
	}
}
