package com;

public class Department {
	int deptId;
	String deptName;
	

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
