package com;

public class BlockDemo {

	// instance blocks : no name 
	
	/**
	 * notes
	 * ------------
	 * 
	 *  -> before main method, static blocks get executed. (only once)
	 *  -> before constructor, instance blocks get executed on every object creation
	 * 
	 * 
	 */
	
	int age=98; // instance 
	
	public BlockDemo() {
		System.out.println("default constructor");
	}
	
	{ // instance block
		System.out.println("Instance block-1 :: "+age);	
	}
	{ // instance block
		System.out.println("Instance block-2:: "+age);
	
	}
	
	static {
		System.out.println("Static block-1 ");
	}
	
	static {
		System.out.println("Static block-2");
	}
	
	
	 void f1() {
		 /*
		 void f2() { // invalid
			 
		 }
		 */
	 }
	
	
	
	public static void main(String[] args) {
		
		System.out.println("step-1 :: main");
		
		Colour favorateColour; // enum type
		
		BlockDemo b1=new BlockDemo();
		BlockDemo b2=new BlockDemo();
		
		favorateColour=Colour.YELLOW;
		System.out.println(favorateColour);
		
		
		
		
		
		
		
		
	}
}
