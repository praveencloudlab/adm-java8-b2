package com;

public class Test {

	public static void main(String[] args) {
		
		//DBConnection db1=new DBConnection();
		//DBConnection db2=new DBConnection();
		
		DBConnection db1 = DBConnection.getConnection();
		DBConnection db2 = DBConnection.getConnection();
		
		db1.f1();
		db2.f1();
		
	}

}
