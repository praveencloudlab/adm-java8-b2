package com;

import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args)throws Exception,FileNotFoundException {
		
		System.out.println("fine");
		Class.forName("com.Employee");
		

	}

}
