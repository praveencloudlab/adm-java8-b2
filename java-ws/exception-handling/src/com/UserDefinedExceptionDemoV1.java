package com;

public class UserDefinedExceptionDemoV1 {

	public static void main(String[] args) throws NegativeNumberException{

		int x = -766;

		if (x < 0) {
			throw new NegativeNumberException("Number must not be negative");
		}
		System.out.println(x);

	}

}
