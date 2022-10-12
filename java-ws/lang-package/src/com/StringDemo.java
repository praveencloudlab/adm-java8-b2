package com;

public class StringDemo {
	
	/*
	 * types of objects : 2 types
	 * ----------------------------
	 * 1.dependency
	 * 2.dependent
	 * 
	 * 1.immutable : content of an object can not be modified
	 * 	ex: String and all wrapper classes
	 * 2.mutable   : content of an object can be modified
	 *  ex: StringBuffer
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		String s1=new String("Abc"); // immutable
		
		System.out.println("s1: "+s1);
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s1 identity hashcode: "+System.identityHashCode(s1));
		
		String s2 = new String("Abc");
		
		System.out.println("s2: "+s2);
		System.out.println("s2 hashcode: "+s2.hashCode());
		System.out.println("s2 identity hashcode: "+System.identityHashCode(s2));
		
		// == operator always compares the identity hash code
		
		// equals always compares content only.
		
		/*
		if(s1==s2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		*/
		
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		

		
		

	}

}
