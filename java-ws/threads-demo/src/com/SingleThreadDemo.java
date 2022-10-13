package com;

import java.util.Scanner;

public class SingleThreadDemo {

	Scanner sc = new Scanner(System.in);

	void f1() {
		System.out.println("F1: "+Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println("I= " + i);
			if (i == 4) {
				System.out.println("input value for x: ");
				int x=sc.nextInt();
				System.out.println(x);
			}
		}
	}

	void f2() {
		System.out.println("F2: "+Thread.currentThread().getName());

		for (int j = 1; j <= 5; j++)
			System.out.println("J= " + j);
	}

	public static void main(String[] args) {
		
		System.out.println("in main: "+Thread.currentThread().getName());

		SingleThreadDemo d = new SingleThreadDemo();

		d.f1();
		d.f2();

	}

}
