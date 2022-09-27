package com;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("hello java!");
		// type syso and hit control space
		System.out.println("LIne 2");
		System.out.println("Line 3");
		
		int x=100;
		System.out.println(x);
		System.out.println("X is "+x);
		System.out.println("The value of x is "+x);
		System.out.println(x+" is the value of x");
		System.out.println("The number "+x+" is from x variable");
		
		// string : S must be in capital letter
		
		String s1="Praveen";
		System.out.println("Name is "+s1);
		System.out.println("Sum of 10 and 20 is "+(10+20));
		System.out.println(10/2); // 5
		System.out.println(10%2); // only remaindr : 0
		System.out.println(10%3); // 1
		System.out.println(10/3); // int/int always int : 3
		System.out.println((double)10/3); // 3.333333333335
		System.out.println(10/2.6); // int/double always double. 3.846153846153846
		
		// single line comment
		
		/*
		 *  multi line comment
		 *  line 2 comment
		 */
		
		/**
		 * documentation comments
		 */
		
		// max value of a integer ? : 2147483647 : 4 bytes
		System.out.println(Integer.MAX_VALUE);// Integer is a class
		// max value of a short? : 32767 : 2 bytes
		System.out.println(Short.MAX_VALUE);
		// max value of long ? : 9223372036854775807 : 8 bytes
		System.out.println(Long.MAX_VALUE);
		// max value of Byte? : 127 : 1 bytes
		System.out.println(Byte.MAX_VALUE);
		
		// max value of float? // 3.4028235E38 : 4 bytes
		System.out.println(Float.MAX_VALUE);
		
		// max value of double? : 1.7976931348623157E308 : b bytes
		System.out.println(Double.MAX_VALUE);
		
		// char is 2 bytes
		
		// boolean stores true or false
		
		System.out.println((10>200)); // relational operator always gives boolean (true / false)
			
	}

}
