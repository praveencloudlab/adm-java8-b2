package com;

public class GenDemo <E> {
	
	void f1(E element) { // here E is Generic data type. Dynamically store any type of content
		System.out.println("Element is "+element+" and type is "+element.getClass().getTypeName());
	}
	
	

	public static void main(String[] args) {
		
		GenDemo g=new GenDemo();
	
		g.f1(1000);
		g.f1(763.76f);
		g.f1(888.54);
		g.f1(826382L);
		g.f1("Abc");
		g.f1('A');
		g.f1(false);
		
		
		
		

	}

}
