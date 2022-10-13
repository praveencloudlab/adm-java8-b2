package com;

public class ThrowDemo {

	public static void main(String[] args) {
		
		try {
			
			int x=-98;
			if(x<0) {
				throw new Exception("Number must not be negative");
			}
			System.out.println("X is "+x);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
