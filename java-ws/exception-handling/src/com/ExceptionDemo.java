package com;

public class ExceptionDemo {
	/*
	 * 
	 *   exception : 2 types
	 *   ---------------------
	 *   1. checked exception: compile time
	 *   2. runtime exception: runtime
	 *   
	 *   how to handle exceptions?
	 *   ----------------------------
	 *   1.try
	 *   2.catch
	 *   3.finally
	 *   
	 *   notes
	 *   -------
	 *   -> try lock always must be followed by either catch or finally
	 *   -> catch block get executed only where there is an exception occurred
	 *   -> finally block always get executed, even though there is an exception or not 
	 *   -> catch or finally must be immediate to the try block. 
	 *   -> there must not be any statements in between try/catch/finally
	 *   
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		try {
			
		System.out.println("first line");
		int x=10;
		int y=x/0;
		int i[]=new int[1];
		i[3]=87;
		
		System.out.println(y);
		
		}
		catch(Exception e) {
			System.out.println("failed deu to "+e);
			e.printStackTrace();
		}finally {
			System.out.println("always executed..");
		}
		
		System.out.println("last line");
		
		
	}

}
