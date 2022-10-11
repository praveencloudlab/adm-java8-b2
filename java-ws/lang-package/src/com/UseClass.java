package com;

public class UseClass {
	
	/*
	 * notes
	 * ---------
	 * -> when two complex object content is same, then
	 *    make their hash codes same by overriding hashCode
	 *    method from Object class 
	 */


	public static void main(String[] args) {
		
		Employee e1=new Employee(1000,"Praveen");
		Employee e2=new Employee(1000,"Praveen");
		
		//String s1="Abc"; // simple class
		//String s2="Abc"; // simple class
		
		System.out.println("hash code of e1: "+e1.hashCode());
		System.out.println("hash code of e2: "+e2.hashCode());
		System.out.println("Identity hashcode of e1: "+System.identityHashCode(e1));
		System.out.println("Identity hashcode of e2: "+System.identityHashCode(e2));

		// == operator always compares hash codes 
		// equals method compares content only
		
		if(e1.equals(e2)) { 
			System.out.println("equal");
		}else {
			System.out.println("not equals");
		}
		
		

	}

}
