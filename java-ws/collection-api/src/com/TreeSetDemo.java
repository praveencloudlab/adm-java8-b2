package com;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> hs=new TreeSet<>();
		// sorted order is guaranteed
		// all elements must be same type
		
		hs.add("Xyz");
		hs.add("Abc");
		hs.add("Khdgg");
		hs.add("Praveen");
		hs.add("B8364");
		hs.add("N98374");
		hs.add("Abc");
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		
		

	}

}
