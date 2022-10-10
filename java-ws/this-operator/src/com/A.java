package com;

public class A {
	
	public void f1() { // invoked by a class obj from UseClass
		System.out.println("A class f1 method");
		// go to b and perform business logic
		B b=new B();
		b.bMethod(this); // A clas obj
	}
	
	public void f2() {
		System.out.println("--invoked by b class bMethod");
	}

}
