package com;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
}

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}

class SortByDob implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getDob().compareTo(emp2.getDob());
	}
}


public class ComplexObjectDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(87, "Kgf", 7633, LocalDate.of(1987, 8, 22));
		Employee e2 = new Employee(90, "Zjh", 5987, LocalDate.of(1984, 6, 11));
		Employee e3 = new Employee(19, "Agf", 1987, LocalDate.of(1991, 2, 21));
		Employee e4 = new Employee(11, "Blk", 1276, LocalDate.of(1982, 1, 16));
		Employee e5 = new Employee(88, "Mhg", 1981, LocalDate.of(1990, 7, 19));

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5);

		System.out.println("Original Data");

		Employee.display(emps);

		System.out.println("Sort By ID");
		Collections.sort(emps);
		Employee.display(emps);

		System.out.println("Sort By Name");
		Collections.sort(emps, new SortByName());
		Employee.display(emps);
		
		System.out.println("Sort By Salary");
		Collections.sort(emps, new SortBySalary());
		Employee.display(emps);
		
		System.out.println("Sort By DOB");
		Collections.sort(emps, new SortByDob());
		Employee.display(emps);

	}

}
