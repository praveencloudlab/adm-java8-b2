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
		
		Employee e1=new Employee(1000);
		Employee e2=new Employee(1000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		// == operator always compares hash codes 
		// equals method compares content only
		if(e1.equals(e2)) { 
			System.out.println("equal");
		}else {
			System.out.println("not equals");
		}
		
		

	}

}
