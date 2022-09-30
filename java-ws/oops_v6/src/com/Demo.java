package com;
import com.p1.C1;
public class Demo extends C1{
	
	/**
	 * 
	 *  access modifiers
	 *  =====================
	 *  --> public    : accessible from any package
	 *  --> protected : accessible from the same package, and other package sub classes
	 *  --> default   : accessible from the same package
	 *  --> private   : accessible from same class
	 *  
	 *  Q: how can you make sure, a class is fully encapsulated?
	 *  	-> define every property / fields as 'private'
	 *  	-> define all methods as 'public' with getXXX and setXXX (getters and setters)
	 *  			-> getXXX means get+followed by property name.
	 *  				ex: int empId;
	 *  					int getEmpId()
	 *              -> getters never have arguments , but will have return type
	 *              -> setter never have return type, but will have arguments
	 *              	ex:  setEmpId(int empId){
	 *                       this.empId=empId;
	 *                       }
	 *  
	 */

	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.f1();
		//c1.f2(); // error
		
		Demo d=new Demo();
		d.f1();
		d.f3(); // d is sub class object of C1 class . C1 class has f3 method as 'protected'
		//d.f2(); // error
		
		
		
		

	}

}
