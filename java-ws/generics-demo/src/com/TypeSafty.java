package com;

public class TypeSafty <E> {
	
	void add(E element) {
		System.out.println("Element is "+element+" and type is "+element.getClass().getTypeName());
	}
	
	
	public static void main(String[] args) {
		
		TypeSafty<Integer> d1=new TypeSafty<>();
		
		TypeSafty<String> d2=new TypeSafty<>();
		
		TypeSafty<Object> d3=new TypeSafty<>();
		
		
		d3.add(10);
		d3.add("Abc");
		d3.add('A');

		
		d1.add(100);
		d1.add(877);
		d1.add(87);
		
		d2.add("Abc");
		d2.add("Xyz");
		
		
		
		
	
		
		
		
		
		

	}

}
