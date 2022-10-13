package com;

public class UserDefinedRuntimeExceptionDemo {

	public static void main(String[] args) {

		int x = 766;

		if (x < 0) {
			throw new NumberNotPositiveException("Number must be positive integer");
		}
		System.out.println(x);

	}

}
