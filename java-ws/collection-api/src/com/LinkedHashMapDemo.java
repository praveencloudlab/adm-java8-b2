package com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	/*
	 * LinedHashMap
	 * -----------------
	 * -> same insertion order displayed
	 * -> map is key and value pair
	 * -> we get value by entering key
	 * -> key must be unique
	 * -> value  be duplication
	 * -> unordered
	 * -> non index based
	 */
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Object> hm=new LinkedHashMap<>();
	
		hm.put(12, "Praveen");
		hm.put(39847, "James");
		hm.put(352, "Praveen");
		hm.put(12, "Praveen");
		hm.put(334, 38947394);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
	}
	
	

}
