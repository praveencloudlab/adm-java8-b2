package com;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private String employeeType;
	
	public Employee() {}
	
	public Employee(int empId, String empName, String employeeType) {
		this.empId = empId;
		this.empName = empName;
		this.employeeType = employeeType;
	}


	public void calculateSalary() {
		
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

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public static void display(Employee emp) {
		System.out.println("ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Type: "+emp.getEmployeeType());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("---------------------------------");
	}
	
	
	
	
	

}
