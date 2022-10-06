package com;

public class Test {

	public static void main(String[] args) {
		
		Employee regularEmployee=new RegularEmployee(100, "James", "Regular", 19);
		regularEmployee.calculateSalary();
		Employee.display(regularEmployee);
		
		Employee contractEmployee=new ContractEmployee(1010, "Praveen", "Contract", 60);
		contractEmployee.calculateSalary();
		Employee.display(contractEmployee);
		
		
		

	}

}
