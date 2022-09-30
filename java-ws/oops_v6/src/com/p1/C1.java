package com.p1;

public class C1 {

	public void f1() { // 
		f4(); // visible with in the same class only
		System.out.println("c1 class f1 method");
	}

	void f2() { // default : visible to all the classes from p1 package only
		System.out.println("c1 class f2 method");
	}

	protected void f3() {
		System.out.println("c1 class f3 method");
	}

	private void f4() {
		System.out.println("c1 class f4 method");
	}

}
