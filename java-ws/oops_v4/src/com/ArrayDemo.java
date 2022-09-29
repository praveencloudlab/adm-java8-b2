package com;

public class ArrayDemo {
	
	/**
	 *   ==> arrays are object by default
	 *   
	 *    method arguments : 2 types
	 *    ===================
	 *    	--> actual arguments
	 *    	--> formal arguments
	 *    
	 *    actual arguments
	 *    -----------------
	 *    	-> arguments which is part of method declaration
	 *    		ex: fun(65) ; here 65 is actual argument
	 *    formal arguments
	 *    -----------------
	 *    	-> arguments which is part of method definition or body
	 *   		ex: fun(int x){}  here x is formal argument
	 *   
	 *    method arguments: 2 types
	 *    -----------------------------
	 *   		--> call by value 
	 *   		--> call by reference
	 * 		
	 * 		call by value
	 *     ------------------
	 *     	--> any changes to the formal argument , will not reflext
	 *         in actual argument
	 *      
	 *     call by reference
	 *    ---------------   
	 * 		--> any changes to the formal argument , reflects back to the actual argument	
	 * 
	 *
	 *    note: all primitive variables by default call by value. 
	 *    note: all objects in java by default call by reference
	 */
	
	   void f1(int x) { // here i is formal argument
		    x=x+100; // changes are reflects with in f1 method only
			System.out.println(" inside f1 method :: x is "+x);  
	   }
	   
	    void f2(int[] nums) {
	    	System.out.println("inside f2 invacation:: nums is ");
			
	    	for(int i=0;i<nums.length;i++) {
	    		nums[i]=nums[i]+100;
	    		System.out.println(nums[i]);
	    	}
	    }
	   
	
	public static void main(String[] args) {
		
		ArrayDemo ad=new ArrayDemo();
		// call by value
		int x=100;
		System.out.println("before f1 invacation:: x is "+x);
		ad.f1(x); // here x is actual argument
		System.out.println("after f1 invacation:: x is "+x);
		
		// call by reference
		
		System.out.println("=======================================");
		
		int nums[]= {10,20,30};
		System.out.println("before f2 invacation:: nums is ");
		for(int i:nums) {
			System.out.println(i);
		}
		ad.f2(nums);
		
		System.out.println("afer f2 invacation:: nums is ");
		for(int i:nums) {
			System.out.println(i);
		}
		
		
		

		
		
		
	}

}
