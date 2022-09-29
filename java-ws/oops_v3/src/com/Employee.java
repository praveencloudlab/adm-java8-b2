package com;

public class Employee {
	
	int empId; // 0
	String empName; // null
	double salary; // 0.0
	
	static String companyName;
	
	/*
	public Employee() { // default constructor 
		empId=1;
		empName="Abc";
		salary=9998;
		System.out.println(">>> 2. Employee object created...");
	}
	*/
	
	// to restrict a object to assign data for object, then use argument constructor
	// employee id must be provided at the time of creation of object
	
	
	public Employee(int empId) {
		this.empId=empId;
	}
	
	
	
	// empId, employee name must be provided
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;	
	}
	
	
	// empId, employee name and salary must be provided
	public Employee(int empId,String empName,double salary) {
		this.empId=empId;
		this.empName=empName;	
		this.salary=salary;
	}
	
	void display() { // instance method: must be called with object from static method
		System.out.println("Company: "+companyName);
		System.out.println("Empoyee ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("-------------------------------");
	}
	
	// static display method
	
	static void displayV1(Employee emp) {
		System.out.println("Company: "+companyName);
		System.out.println("Empoyee ID: "+emp.empId);
		System.out.println("Name: "+emp.empName);
		System.out.println("Salary: "+emp.salary);
		System.out.println("-------------------------------");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(">>>>1. main method");
		
		Employee e1=new Employee(1,"Praveen");
		Employee e2=new Employee(2,"James");
		
		//e1.empId=10; // instance data is  unique to each object
		//e1.empName="James";
		//e1.salary=9000;
		
		//e2.empId=11;
		//e2.empName="Bucky";
		//e2.salary=85000;
		
		companyName="Cognizant"; // static data is  sharable across all objects.
		
		/*
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.salary);
		System.out.println(e1.companyName);
		
		e1.companyName="CTS";
		
		System.out.println("-------------------------------");
		System.out.println(e2.empId);
		System.out.println(e2.empName);
		System.out.println(e2.salary);
		System.out.println(e2.companyName);
		*/
		
		//e1.display(); // displays e1 object content only
		//e2.display(); // displays e2 object content only
		
		displayV1(e1);
		displayV1(e2);
		
		

	}

}
