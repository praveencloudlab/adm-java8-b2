package oops_v2;

public class Employee {
	
	/**
	 *  1.properties/fields/variables
	 *  2.methods
	 *  3.constructors
	 *  4.blocks
	 *  5.inner classes
	 *  6.interfaces
	 *  7.enumerations
	 *  
	 *  //---------------------------------------
	 *  
	 *  1.properties/fields/variables
	 *  ========================================
	 *  	1.instance (non static)
	 *  	2.static
	 *  	3.final
	 *  
	 *  2.methods
	 *  =================
	 *  	1.instance method : unique copy to each object
	 *  	2.static method   : sharable to all objects
	 *  	3.final method    : can not be overridden in sub classes
	 *  	4.abstract method : method specification (no body)
	 *  	5.native method   : other than java language
	 *  
	 *  3.constructors
	 *  =================
	 *  	1.default constructor
	 *  	2.argument constructor
	 *  
	 *  4.blocks
	 *  =============
	 *  	1.instance blocks
	 *  	2.static blocks
	 *  
	 *  types of class
	 *  ===============
	 *  	1.concrete class : a class with full implementation
	 *  	2.abstract class : a class with partial implementation
	 *  	3.final class    : a class which can not be inherited
	 *  	4.inner class    : child class of type parent class.
	 *  		4.1 static inner class : can be invoked with out parent class object
	 *  		4.2	private inner class: parent object mandate to invoke private inner classes
	 *  	
	 *  =============================
	 *  1.instance (non static)
	 *  =============================
	 *  instance: unique copy of objects. One object instance variable value is not available to another object  
	 *  
	 *  =============================
	 *  2.static
	 *  =============================
	 *  static : static variables are available to all objects. i.e . all objects can share static content
	 *  
	 * 
	 *  
	 *   instance data
	 *   ================
	 *   -> instance data is directly available to all instance methods.
	 *   -> instance data is not directly available to all static methods.
	 *   
	 *   static data
	 *   =============
	 *   -> static data is available to only to static methods directly
	 *   -> static data  available to instance methods directly.
	 *   
	 *    Note
	 *    -----
	 *    1.static methods allow static data directly
	 *    2.static methods never allow instance data directly
	 *    3.instance methods allows static and non static data directly
	 *   
	 *    =========================
	 *    accessing class data
	 *    =========================
	 *    
	 *    1. non static / instance
	 *    ===============================
	 *    -> instance data is not directly accessible to static methods
	 *    -> instance data is directly accessible to instance methods
	 *    
	 *    2. static
	 *    =============
	 *    -> static methods allows static data directly
	 *    -> static methods never allow non static/instance data directly
	 *    
	 *    
	 *  ======================
	 *  what is an object?
	 *  ======================
	 *  -> object is blue print of a class which contains
	 *  	-> identity (variables) : name
	 *  	-> state (data)         : bird
	 *  	-> actions (methods)    : fly, eat, shout
	 *  
	 *  
	 *   need of creation of object?
	 *   =============================
	 *   -> we need object to access instance data from a static method with in same class
	 *   -> we need object to access instance data from static and instance methods from another class
	 *   
	 *    
	 *    how to create an object?
	 *    ===============================
	 *    1.by using dynamic memory allocation (new operator)
	 *    2.using factory method technique (newInstance)
	 *    3.using cloning technique (Clonable interface)
	 *    
	 *    1.by using dynamic memory allocation (new operator)
	 *    ==========================================================
	 *    -> new operator must be followed by class constructor
	 *    
	 *    note: class name and constructor name must be same.
	 *    
	 *     ex: new Employee();
	 *     int x=10
	 *     
	 *     Employee e = new Employee(); // correct
	 *     Student  s = new Employee(); // wrong
	 *     
	 *     hash code
	 *     ------------
	 *     hashcode is a memory representation number to identify object in memory
	 *     
	 *     
	 *     
	 *     static data access
	 *     -----------------------
	 *     -> static data directly available to all the methods from the same class
	 *     -> static data can be accessed with class name from  different class.
	 *     
	 *  
	 */
	
	int empId; // instance
	String empName; // instance
	int salary; // instance
	
	static String managerName;
	static String companyName;
	
	void f1() { // instance method : allows static and non static data
		empId=100;
		managerName="David";
	}
	static void f2() { // static method: allows only static data
		//empId=1000;//error:  can not access non static data from static methods directly
		Employee e1=new Employee();
		e1.empId=10000;// valid
		e1.empName="James";
		e1.salary=99888;
		
		companyName="CTS";
		managerName="test";
	}
	
	
	public static void main(String[] args) {
		
		//empId=10; //error:  can not access non static data from static methods directly
		managerName="Abc";
		companyName="Cognizant";
		
		// how to create object
		
		 Employee emp= new Employee(); // object
		 emp.empId=10; // valid
		 
		 
		 
		
		
	}
	
	

}
