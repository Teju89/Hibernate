package com.jspider.facebook;

public class Department 
{
	private int deptNo;
	private String deptName;
	
	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	

}
