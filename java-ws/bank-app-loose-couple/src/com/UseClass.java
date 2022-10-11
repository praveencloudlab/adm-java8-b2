package com;

import java.util.ArrayList;
import java.util.List;

public class UseClass {

	public static void main(String[] args) {
		
		Notification smsNotification=new SmsAlert();
		Notification emailNotification=new EmailAlert();
		
		
		List<Notification> notifications=new ArrayList<>();
		
		notifications.add(smsNotification);
		notifications.add(emailNotification);
		
		// make sure that more than one notification is getting added here
		
		Account acc1=new Account(10000);
		acc1.setNotifications(notifications);
		acc1.deposit(20000); // 30000
		acc1.withdraw(10000); // 20000
	
	}

}
