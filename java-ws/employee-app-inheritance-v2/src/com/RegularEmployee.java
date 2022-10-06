package com;

public class RegularEmployee extends Employee{
	private int numberOfDaysWorked;
	private int perDayCost=2500;
	
	public RegularEmployee(int empId, String empName, String employeeType,int numberOfDaysWorked) {
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.setEmployeeType(employeeType);
		this.numberOfDaysWorked=numberOfDaysWorked;
	}
	
	
	@Override
	public void calculateSalary() {
		this.setSalary(numberOfDaysWorked*perDayCost); // this means the object who ever calling this method
	}
	
	/*
	@Override
	public void calculateSalary() {
		
	}
	*/
}
