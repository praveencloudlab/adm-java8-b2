package com.p1;

public class Test {

	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.f1(); // public
		c1.f2(); // default
		c1.f3(); // protected
		//c1.f4(); // error

	}

}
