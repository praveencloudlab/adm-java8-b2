package com;

public class SmsAlert implements Notification {
@Override
public void alert(double amount, double balance) {
	System.out.println("SMS message: "+amount+" is successfully processed. Avaiable balance is "+balance);
}

}
