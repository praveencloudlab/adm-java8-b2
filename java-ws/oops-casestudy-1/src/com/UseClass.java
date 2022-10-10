package com;

import java.time.LocalDate;

public class UseClass {

	public static void main(String[] args) {
		Student s1=new Student("Praveen", "Married", 69, "Male", LocalDate.of(1981, 12, 13), "Hyderabad", "pemail@abc.com", "semail@abc.com", 9987676543L, "Mathematics", "Btech", "Indian");
		s1.registerStudent();
	}

}
