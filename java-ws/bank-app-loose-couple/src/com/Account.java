package com;

import java.util.List;

public class Account {
	
	//private Notification notification;
	
	
	List<Notification> notifications;
	
	private double balance;

	public Account(double balance) {
		this.balance=balance;
	}
	
	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}




	public void deposit(double amount) {
		balance+=amount;
		notifications.forEach(notification->notification.alert(amount, balance));
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		notifications.forEach(notification->notification.alert(amount, balance));
	}
	
}
