package com;

class C1{
	int x=100;
	void f1() {}
	void f2() {}
}

public class HashCodeDemo {
	
	/*
	 * Hashcode
	 * -------------
	 * -> unique number to represent an object from the heap
	 * -> hashcode is not memory location
	 * -> hascode can be generated for Simple and Complex classes differently
	 * 
	 * Simple class
	 * ------------
	 * -> An object who can hold only one type of data always
	 *    Ex: String : it can hold only string
	 *    Ex: Integer: it can hold only numbers
	 * 
	 *    Complex class
	 *  ---------------
	 *  -> An object who can hold more than one data type values
	 *     Ex: class Employee{int x,float y,String z}
	 *  
	 *    
	 * 
	 */
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		C1 c2=new C1();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		String s1="CA"; // hashcode : 65 (ascii code)
		String s2="CA";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		
	}

}
