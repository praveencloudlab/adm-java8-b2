package com;

import java.util.HashMap;

public class HashMapDemo {
	
	/*
	 * map
	 * -----
	 * -> map is key and value pair
	 * -> we get value by entering key
	 * -> key must be unique
	 * -> value  be duplication
	 * -> unordered
	 * -> non index based
	 */
	
	public static void main(String[] args) {
		
		HashMap<Integer, Object> hm=new HashMap<>();
		
		hm.put(12, "Praveen");
		hm.put(39847, "James");
		hm.put(null, "Praveen");
		hm.put(12, "Praveen");
		hm.put(334, null);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
	}
	
	

}
