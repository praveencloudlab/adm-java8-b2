package com;

public class Demo {
	
	
	void f1(int x) {
		System.out.println("X is "+x);
	}
	void f1(float x) {
		System.out.println("X is "+x);
	}
	void f1(double x) {
		System.out.println("X is "+x);
	}
	void f1(long x) {
		System.out.println("X is "+x);
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();
		 d.f1(100);
		 d.f1(76.43f);
		 d.f1(886.32);
		 d.f1(834638L);
		 
		 
		
		
	}
	

}
