package com;

public class MethodDemo {
	
	/**
	 *  what is polymorphism?
	 *  -----------------------
	 *  ==> Appearing in many forms: (one method name can do many operations)
	 *  
	 *  
	 *  polymorphism : 2 types
	 *  -----------------------
	 *  1.static / compile time : method overloading
	 *  2.dynamic/run time      : method overriding : inheritance
	 *  
	 *  method overloading
	 *  =======================
	 *  => writing same method name with different signature.
	 *   what is signature?
	 *   
	 *   	-> number of arguments
	 *   	-> type of arguments
	 *   	-> position of arguments
	 *   
	 *   
	 *   note: we can not define more than one method with same signature.
	 *   

	 */
	
	// void f1() {} // f1 method with no arguments
	 //void f1() {} error // f1 method with no arguments
	
	/*
	 void f1() {}
	 //void f111() {}
	 void f1(int x) {}
	 void f1(float x) {}
	 void f1(double x) {}
	 void f1(long x) {}
	 void f1(short x) {}
	 void f1(byte x) {}
	 void f1(boolean x) {}
	 void f1(char x) {}
	 //void f1(char x) {} // error
	 void f1(String x) {}
	 
	 note: in method overloading, return type is not considered.
	 
	 */
	
	
	
	
	  static void f1(long x) { // 8 bytes
		  System.out.println("long :: x "+x);
	  }
	  
	  static void f1(int x) { // 4 bytes
	  System.out.println("int :: x "+x);
	  }
	 
	  
	  static void f1(short x) { // 2 bytes
		  System.out.println("short :: x "+x);
	  }
	  
	  static void f1(byte x) { // 1 byte
		  System.out.println("byte :: x "+x);
	  }
	  
	 
	  static void f1(double x) { // 8 bytes
		  System.out.println("double :: x "+x);
	  }
	  
	  static void f1(char x) {
		  System.out.println("char :: x "+x);
	  }
	
	  static void f1(boolean x) {
		  System.out.println("boolean :: x "+x);
	  }


	public static void main(String[] args) {
		
		
		    //f1((byte)76); //  ?? 
		    /*
		     *  byte
		     *  short
		     *  int
		     *  long
		     *  float
		     *  double
		     */
		    
		
		   f1(65.76f); // ??  :: float, if float not available, then double
		    
		   
	
		 //f1(87); // int :: any number by default java treats it as 'int'
		 //f1(766663L); // long
		 //f1((short)7664);
		 //f1((byte)123);
		
		 //f1(76.54);// double
		 //f1(786.65f); // float
		 //f1('A'); /// char
		 //f1((int)'A'); // int
		  //f1(false); // boolean
		 
		
		 
	
	
	
	
	}

}
