package oops_v2;

public class Test {
	
	
	static void m1() { // static method
		
		Employee.managerName="Abc";
		Employee.companyName="CTS";
		
	}
	void m2() {// instance
		Employee.managerName="Abc";
		Employee.companyName="CTS";
		
		Employee e2=new Employee();
		e2.empId=100;
		e2.empName="Abc";
		e2.salary=998;
		
	}

	public static void main(String[] args) {
		

	}

}
