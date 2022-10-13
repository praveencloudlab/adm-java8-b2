package com;

import java.util.Scanner;

public class MultiThreadDemo extends Thread{
	
	@Override
	public void run() {
		f2();
	}

	Scanner sc = new Scanner(System.in);

	void f2() {
		System.out.println("F2: "+Thread.currentThread().getName());

		for (int j = 1; j <= 5; j++)
			System.out.println("J= " + j);
	}

	public static void main(String[] args) {
		
		System.out.println("in main: "+Thread.currentThread().getName());

		
		// more than one thread is pointing to a single object, then it is called multi threding
		
		MultiThreadDemo d = new MultiThreadDemo();
		
		Thread t1=new Thread(d);
		t1.setName("First-Thread");
		Thread t2=new Thread(d);
		t2.setName("Second-Thread");
		
        t1.start();
        t2.start();

	}

}
