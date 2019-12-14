package com.class35;

import java.util.HashMap;
import java.util.Map;

public class Building {
	
	public static void main(String[] args) {
		
		Map<Integer, String> comp = new HashMap<>();
		
		comp.put(1, "Google");
		comp.put(2, "Syntax");
		comp.put(3, "Samsung");
		comp.put(4, "Xiaomi");
		comp.put(5, "Huawei");
		comp.put(6, "Nokia");
		comp.put(7, "Apple");
		
		System.out.println(comp.size());
		comp.replace(4, "Microsoft");
		comp.remove(7);
		System.out.println(comp);
		
		
		
		
	}
	

}
