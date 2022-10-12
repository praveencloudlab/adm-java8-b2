package com;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		int x=10;
		
		 String s1="Abc";
		 
		 StringBuffer sb1=new StringBuffer("Abc");
		 StringBuffer sb2=new StringBuffer("Abc");
		 //sb1=sb2;
		 
		 System.out.println("sb1: "+sb1);
		 System.out.println("hashcode of sb1: "+sb1.hashCode());
		 System.out.println("identity hashcode of sb1: "+System.identityHashCode(sb1));
		 
		 System.out.println("------------------------------------------");
		 
		// sb1.append(" Xyz");
		 
		 System.out.println("sb1: "+sb1);
		 System.out.println("hashcode of sb1: "+sb1.hashCode());
		 System.out.println("identity hashcode of sb1: "+System.identityHashCode(sb1));
		 
		 System.out.println("------------------------------------------");

		 
		 System.out.println("sb2: "+sb2);
		 System.out.println("hashcode of sb2: "+sb2.hashCode());
		 System.out.println("identity hashcode of sb2: "+System.identityHashCode(sb2));
		 
		 System.out.println("------------------------------------------");

	
	
		 /*
		 if(sb1==sb2) {
			 System.out.println("Equal");
		 }else {
			 System.out.println("Not equal");
		 }
		 */
		 

		 if(sb1.toString().equals(sb2.toString())) {
			 System.out.println("Equal");
		 }else {
			 System.out.println("Not equal");
		 }
		 
		 
	
	
	
	}

}
