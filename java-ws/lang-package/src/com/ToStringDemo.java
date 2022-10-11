package com;

class Person{
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}

public class ToStringDemo {

	public static void main(String[] args) {
		
		Person p1=new Person(10, "Praveen");
		Person p2=new Person(11, "James");

		
		System.out.println(p1);
		System.out.println(p2);

	}

}
