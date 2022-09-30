package com;

public class Use {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Praveen");
		emp.setSalary(2000);
		
		//emp.salary=9834793; // not recommended..
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
	}

}
