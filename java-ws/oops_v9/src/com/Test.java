package com;

class Animal {

	void behaviour() {
		System.out.println("Animal Behaviour");
	}

	void copyRights() {
		System.out.println("Animal class copyrights. Rights reserved.");
	}
}

class Bird extends Animal {

	void behaviour() {
		System.out.println("Bird can fly");
	}

	void f1() {
		System.out.println("f1 method of bird");
	}
}

class Tiger extends Animal {

	void behaviour() {
		System.out.println("Tiger can hunt");
	}

	void f2() {
		System.out.println("f2 method of tiger");
	}
}

public class Test {

	public static void main(String[] args) {

		// Tiger t=new Tiger();
		// t.behaviour();
		// t.f2();
		// t.copyRights();

		// Bird b=new Bird();
		// b.behaviour();

		Animal animal; // ref of an super class.

		animal = new Tiger();
		
		animal.behaviour();
		animal.copyRights();
		// animal.f2(); // data abstraction

		animal = new Bird();
		
		animal.behaviour();
		animal.copyRights();
		// animal.f1(); // data abstraction

	}

}
