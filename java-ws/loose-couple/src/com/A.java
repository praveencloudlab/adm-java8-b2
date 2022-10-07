package com;

public class A {
	
	private Show show;

	public A(Show show) {
		this.show = show;
	}

	public void display() {
		System.out.println("from A class");
		System.out.println("----------------------");
		show.display();
	}

}
