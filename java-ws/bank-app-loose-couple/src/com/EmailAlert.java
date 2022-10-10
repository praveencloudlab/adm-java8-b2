package com;

public class EmailAlert implements Notification{
	
	@Override
	public void alert(double amount, double balance) {
		System.out.println("Email message: "+amount+" is successfully processed. Avaiable balance is "+balance);
	}

}
