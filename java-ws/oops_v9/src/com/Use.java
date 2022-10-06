package com;

class Calc {
	/*
	 * 
	 *  dynamic polymorphism 
	 *  =========================
	 * 
	 * method overriding
	 * ---------------------
	 *  -> same with name with same signature.
	 *  	signature includes
	 *  		-> name of method
	 *  		-> number of arguments
	 *  		-> type of arguments
	 *  		-> position of arguments
	 *  		-> visibility scope of method
	 * 
	 * 
	 */
	
	int x;

	int calculate(int x,int y) {
		return 0;
	}
}

class Sum extends Calc{

	 int calculate(int x, int y) {
		 return x+y;
	 }
}

class Mul extends Calc{
	int calculate(int x,int y) {
		return x*y;
	}
}

public class Use {

	public static void main(String[] args) {
		
		Sum s=new Sum();
		Mul m=new Mul();
		
		System.out.println(s.calculate(100, 200));
		System.out.println(m.calculate(10, 6));
		
		
		
		

	}

}
