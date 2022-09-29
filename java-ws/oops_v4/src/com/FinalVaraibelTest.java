package com;

public class FinalVaraibelTest {
	
	final static int MAX_VALUE=87; // class level final properties must be initialized
	final String COMPANY="Cognizant";
	public static void main(String[] args) {
		
		// can i define local variable as final?
		final int i; // local final variable may/may not be initialized
		i=100;
		System.out.println(i);
		System.out.println(MAX_VALUE);
		
		//MAX_VALUE=1000;

	}

}
