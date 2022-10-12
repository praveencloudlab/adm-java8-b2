package com;

class Student{

	int id;
	String name;
	double marks;
	
	
	static int count=0;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student Object garbage collected "+(++count));
	}
	
}

public class GarbageCollection {
	
	public static void main(String[] args) {
		System.out.println("main");
		
		/*
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		long l=(rt.totalMemory() - rt.freeMemory());
		System.out.println("used "+l);
		*/
		
		//Student s1=new Student();
		
		//s1=null;
		
		//System.gc();
		
		
		
		for(int i=1;i<960000;i++) {
			new Student();
		}
		
		
		
		
		
		
		
		
		
	}
	

}
