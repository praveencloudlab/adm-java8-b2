package com;

class A{
	
	public A() {
		System.out.println("A default constructor");
	}
	
}
class B extends A{ // A is super class B:: B contains copy of A's constructors, methods and data
	
	public B() {
		System.out.println("B default constructor");
	}
	
}

class C extends B{
	public C() {
		System.out.println("C default constructor");
	}
}

public class Use {

	public static void main(String[] args) {
		
		C c=new C();

	}

}
