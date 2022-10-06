package com;

final class C1{
	
}
//class C2 extends C1{} // error .
// String is one of final class in java


class A{
	
	public void f1() {}
	void f2() {}
	protected void f3() {}
	private void f4() {}
	final void f5() {}
	
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
