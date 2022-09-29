package com;

public class Method_Depth {
	
	
	 void sum() {
		 System.out.println(">>> sum");
	 }
	 
	 //void sum(int x,int y) {
	//	 System.out.println("sum of "+x+" and "+y+" is "+(x+y));
	 //}
	 
	 int sum(int x,int y) {
		return x+y; 
	 }
	
	
	public static void main(String[] args) {
		
		Method_Depth m=new Method_Depth();
		m.sum();
		//m.sum(10,20);
		int res = m.sum(100,200);
		
		System.out.println("Result is "+res);
		System.out.println(100+" + "+200+" is "+res);
		System.out.println("sum of 100 and 200 is "+res);
		
		double pow = Math.pow(10, 2);
		System.out.println("Quare is "+pow);
		
		
	}
	
	

}
