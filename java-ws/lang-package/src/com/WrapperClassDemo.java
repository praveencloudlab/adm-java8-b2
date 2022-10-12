package com;

public class WrapperClassDemo {
	
	/*
	 *  Wrapper classes
	 *  -------------------
	 *  -> to convert primitive into object and vice versa
	 *  
	 *  ----------------------------------------
	 *  primitive type		Wrapper class type		
	 *  ----------------------------------------
	 *  int					Integer
	 *  short				Short
	 *  byte				Byte
	 *  long				Long
	 *  float				Float
	 *  double				Double
	 *  boolean				Boolean
	 *  char				Character
	 *  -----------------------------------------
	 *  
	 *  
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int x=10;
		Integer i=x;
		
		System.out.println(i);
		System.out.println(x);
		
		short s=i.shortValue();
		System.out.println(s);
		
		float f=i;
		double d=i;
		
		byte b=i.byteValue();
		long l=i;
		
		Float ff=98.65f;
		
		int xx=ff.intValue();
		
		Integer obj=877;
		int res = Integer.reverse(xx);
		System.out.println(res);
		
		

	}

}
