package com;

public interface MyInter {
	/*
	 *  interface
	 *  ============
	 *  -> interface is a method specification which contains zero or more
	 *     abstract methods only
	 *  -> by default every method in interface is 'public abstract' 
	 *  -> by default every variable in interface is 'public static final'
	 *  -> an interface without any methods called marker or tagged interface
	 *  -> interface object can not be created.
	 *  -> interface reference can store all its implemented class objects
	 *  -> all the sub classes of interface must implement all the abstract 
	 *     methods of an interface
	 *   -> if any of sub class not implementing any one of abstract method of
	 *      an interface, then that sub class must be defined as 'abstract'
	 *  
	 *   Notes
	 *   -------
	 *   1.class can extends to another class
	 *   2.class can extends maximum of one class only.
	 *   3.class can implements more than one interface
	 *   4.class can not implements another class
	 *   5.interface can extends more than one interfaces
	 *   6.interface can not implements another interface
	 *   
	 *   single inheritance: a class implementing only one interface
	 *   multiple inheritance: a class implementing more than one interface
	 */
	
	
	 public static final int MAX_NUM=87;
	 int MAX_AGE=98; // public static and final by default
	
	
	 public abstract void f1();
	 //void f2(); // public abstract by default
	
	
	
	
	
	
	
	
	
	

}
