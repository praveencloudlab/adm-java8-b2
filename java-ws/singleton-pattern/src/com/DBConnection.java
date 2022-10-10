package com;

public class DBConnection {
	
	/*
	 * single ton
	 * ---------------
	 * 1.make constructor as private
	 * 2.define DBConnection reference at class level as static
	 * 3.create static method and  create DBConnection object, if
	 *   it is not already created and return it.
	 */
	
	private static DBConnection con;
	
	private DBConnection() {
		System.out.println("DBConnection object created on "+this.hashCode());
	}
	
	public static DBConnection getConnection() {
		if(con==null) {
			con=new DBConnection();
			return con;
		}
		return con;
	}
	
	public void f1() {
		System.out.println("f1 is executed by "+this.hashCode());
	}
	
	

}
