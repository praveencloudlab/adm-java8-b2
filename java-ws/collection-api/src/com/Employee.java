package com;

import java.time.LocalDate;
import java.util.List;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double salary;
	private LocalDate dob;
	
	public Employee(int empId, String empName, double salary, LocalDate dob) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
	}
	
	@Override
	public int compareTo(Employee emp) {
		return empId - emp.getEmpId();
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
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public static void display(List<Employee> emps) {
		System.out.println("------------------------------------");
		System.out.println("Id\tName\tSalary\tDOB");
		System.out.println("------------------------------------");
		for(Employee emp:emps) {
			System.out.print(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getSalary()+"\t"+emp.getDob());
			System.out.println();
		}
		System.out.println("------------------------------------");
	}
	
	
	
	
	

}
