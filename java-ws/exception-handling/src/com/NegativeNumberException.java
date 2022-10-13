package com;

// if extends Exception => checked exception
// if extends RuntimeException => Unchecked Exception
public class NegativeNumberException extends Exception {

	public NegativeNumberException(String msg) {
		super(msg);
	}
	
}
