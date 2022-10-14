package com;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Object> ar=new Vector<>(); // ar get created with 10 objects size
		
		ar.add("123");
		ar.add(456);
		ar.add('A');
		ar.add("Abc");
		ar.add(false);
		ar.add(456);
		ar.add(3847.43f);
		ar.add(847384.434);
		ar.add("Abc");
		
		System.out.println(ar);
		
		// AL operations
		
		ar.remove(4);
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		ar.set(2, 'K');
		System.out.println(ar);
		
		ar.add(0, "Praveen");
		ar.add("Kavya");
		ar.add("Anu"); // expands the size of arraylist by having the max size : 15
		
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		
		
		
		
		

	}

}
