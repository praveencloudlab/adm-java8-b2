package com;

import java.time.LocalDate;

public class Use {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Praveen");
		emp.setSalary(2000);
		emp.setDob(LocalDate.of(1996, 2, 12));
		
		//emp.salary=9834793; // not recommended..
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDob());
		
	}

}
