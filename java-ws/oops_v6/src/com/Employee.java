package com;

import java.time.LocalDate;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	private LocalDate dob;

	public LocalDate getDob() {
		
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {

		return salary;
	}

	public void setSalary(double salary) {
		// ?? auth ?
		salary = salary + 1000;
		this.salary = salary;
	}

}
