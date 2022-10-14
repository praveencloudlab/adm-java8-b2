package com;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		// order is guaranteed
		
		hs.add("Xyz");
		hs.add("Abc");
		hs.add(348973.343f);
		
		hs.add("Praveen");
		hs.add(9344);
		hs.add(3947.4344);
		hs.add("Abc");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		

	}

}
