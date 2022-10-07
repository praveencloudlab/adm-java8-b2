package com;

public  class Bank implements Customer,BankEmployee,Manager{

	public void deposit() {
		System.out.println(">> depositing");
	}

	public void withDraw() {
		System.out.println(">> withdrawing");
	}

	public void openAccount() {
		System.out.println(">> opening account");
	}

	public void closeAccount() {
		System.out.println(">> closing account");
	}

	
	public void netbanking() {
		System.out.println(">> netbanking access provided..");
		
	}

	
	public void lockerAccess() {
		System.out.println(">> locker access has given");
		
	}

}
