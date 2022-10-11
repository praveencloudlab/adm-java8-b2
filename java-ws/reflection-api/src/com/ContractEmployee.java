package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ContractEmployee extends Employee{
	
	private int noOfHorursWorked;
	private int hourCost;
	
	public ContractEmployee() {}
	public ContractEmployee(int x) {}
	
	public void f6() {}
	public void f7() {}
	public void f8() {}
	
	public static void f9() {}
	public static void f10() {}
	
	
	public static void main(String[] args) {
		
		ContractEmployee ce=new ContractEmployee();
		Class clname = ce.getClass();
		
		Method[] methods = clname.getMethods();
		Constructor[] constructors = clname.getConstructors();
		
		for(Constructor c:constructors) {
			System.out.println(c.getName());
		}
		
		System.out.println("------------------------------------");
		
		for(Method m:methods) {
			System.out.println(m.getName());
			
		}
	} 

	
	
	
	
	

}
