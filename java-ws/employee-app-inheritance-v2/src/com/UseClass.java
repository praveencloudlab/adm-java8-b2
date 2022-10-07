package com;

import java.util.List;

class Product{
	
	
	/**
	 * productId is used to identify unique product
	 */
	public int productId;
	/**
	 * productName is used to display product name to the client
	 */
	public String productName;
	
	/**
	 * This is default constructor. It initialize default values
	 */
	public Product() {}
	/**
	 * this method is used to save product
	 */
	public void save() {}
	/**
	 * this method is used to find a product by product id
	 */
	public Product findById(int id) {return null;}
	/**
	 * this method is used to fetch all products from database
	 */
	public List<Product> findAll(){return null;}	
	
	
}


final class C1{
	
}
//class C2 extends C1{} // error .
// String is one of final class in java


class A{
	
	public void f1() {}
	void f2() {}
	protected void f3() {}
	private void f4() {}
	
	final void f5() {
		System.out.println("cont message");
	}
	
}
class B extends A{
	
	
	
	public void f1() {}
	
	void f2() {}
	
	protected void f3() {}
	//final void f5() {}
	
	//@Override
	//private void f4() {}
	
	
}


public class UseClass {
	public static void main(String[] args) {
		
		A a=new B();
		a.f5();
		//a.f4();
		A aa=new A();
		//aa.f4(); // error
		aa.f5();
		
		
	}

}
