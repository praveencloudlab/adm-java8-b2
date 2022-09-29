package com;

public class HR {

	public static void main(String[] args) {
		
		Department d1=new Department(10, "Accounts");
		Department d2=new Department(11, "HR");

	
		Employee e1=new Employee(1011,"Praveen",8463846,d1);
		Employee e2=new Employee(1012,"James",455656,d2);
	
		
		// every employee must have a department
		
		
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDept().getDeptId());
		System.out.println(e1.getDept().getDeptName());
		System.out.println("-------------------------------------");
		
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());
		System.out.println(e2.getSalary());
		System.out.println(e2.getDept().getDeptId());
		System.out.println(e2.getDept().getDeptName());
		System.out.println("-------------------------------------");
		
		

	}

}
