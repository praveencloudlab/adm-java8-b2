package com;

public class ContractEmployee extends Employee{
	private int numberOfHoursWorked;
	private int perHourCost=5000;
	
	public ContractEmployee(int empId, String empName, String employeeType,int numberOfHoursWorked) {
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setEmployeeType(employeeType);
		this.numberOfHoursWorked=numberOfHoursWorked;
	}
	
	@Override
	public void calculateSalary() {
		this.setSalary(numberOfHoursWorked*perHourCost);
	}

}
