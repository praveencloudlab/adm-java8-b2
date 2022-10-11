package com;

public class Employee {

	private int id;
	private String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String empName) {
		this.id = id;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		// convert / type caste Object into Employee
		
		Employee emp = null;
		if (obj instanceof Employee) {
			emp = (Employee) obj;
		}else {
			return false;
		}

		return (emp.getId() == id) && (emp.getEmpName().equals(empName));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
