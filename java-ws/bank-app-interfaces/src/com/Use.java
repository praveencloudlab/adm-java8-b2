package com;

public class Use {
	
	/**
	 * 
	 * abstract classes/inheritance supports partial abstraction only
	 * 
	 */
	
	public static void main(String[] args) {
		
		Bank b=new Customer();
		b.withDraw();
		b.deposit();
		b.openAccount();
		b.closeAccount();
		
		b=new BankEmployee();
		b.openAccount();
		b.closeAccount();
		b.withDraw();
		b.deposit();
		
		
		
	}

}
