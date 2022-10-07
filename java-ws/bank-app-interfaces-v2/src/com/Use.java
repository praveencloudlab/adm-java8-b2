package com;

public class Use {
	
	/*
	 *  100%  abstraction and polymorphism can be implemented using interfaces
	 */
	
	public static void main(String[] args) {
		
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		Manager mgr=new Bank();
		
		cust.deposit();
		cust.withDraw();
		
		be.openAccount();
		be.closeAccount();
		
		
		mgr.netbanking();
		mgr.lockerAccess();
		
		
		
	}

}
