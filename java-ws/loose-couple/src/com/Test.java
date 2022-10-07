package com;

public class Test {
	
	public static void main(String[] args) {
		
		Show show=new B();
		
		A a=new A(show); // show is holding B class object
		a.display();
		
		show=new C();
		
		A aObj=new A(show); // show is holding C class object
		aObj.display();
		
		show=new D();
		
		A aObj1=new A(show);
		aObj1.display();
		
		
		
	}

}
