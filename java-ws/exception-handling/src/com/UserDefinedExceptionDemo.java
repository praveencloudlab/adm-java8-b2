package com;

public class UserDefinedExceptionDemo {
	
	public static void main(String[] args) {
		
		int x=-766;
		try {
			if(x<0) {
				throw new NegativeNumberException("Number must not be negative");
			}
			System.out.println(x);
			
		} catch (Exception e) {
			///e.printStackTrace();
			System.out.println(e);
		}
		
		
	}

}
