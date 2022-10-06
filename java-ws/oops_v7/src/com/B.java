package com;

class A { // super class of A is java.lang.Object

   void f2() {
	   System.out.println("A class f2");
   }
	
}

public class B extends A{ // super class of B is java.lang.Object

	void f1() {
		System.out.println("B class f1");
	}

	public static void main(String[] args) {

		B b = new B();
		b.f1(); // 1. B class. in case f1 not available in B, then 2. A class
		b.f2();
		//b.getClass();

	}

}
