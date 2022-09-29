package com;

public class MethodDemo {
	
	/**
	 *  what is polymorphism?
	 *  -----------------------
	 *  ==> Appearing in many forms: (one method name can do many operations)
	 *  
	 *  
	 *  polymorphism : 2 types
	 *  -----------------------
	 *  1.static / compile time : method overloading
	 *  2.dynamic/run time      : method overriding : inheritance
	 *  
	 *  method overloading
	 *  =======================
	 *  => writing same method name with different signature.
	 *   what is signature?
	 *   
	 *   	-> number of arguments
	 *   	-> type of arguments
	 *   	-> position of arguments
	 *   
	 *   
	 *   note: we can not define more than one method with same signature.
	 *   

	 */
	
	// void f1() {} // f1 method with no arguments
	 //void f1() {} error // f1 method with no arguments
	
	 void f1() {}
	 //void f111() {}
	 void f1(int x) {}
	 void f1(float x) {}
	 void f1(double x) {}
	 void f1(long x) {}
	 void f1(short x) {}
	 void f1(byte x) {}
	 void f1(boolean x) {}
	 void f1(char x) {}
	 //void f1(char x) {} // error
	 void f1(String x) {}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
