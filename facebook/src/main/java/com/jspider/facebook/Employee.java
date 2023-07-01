package com.jspider.facebook;

import java.util.List;

public class Employee 
{
	private int empId;
	private String ename;
	private double salary;
	private Department dept;
	private List<String> specialization;
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}
	public Employee(int empId, String ename, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee(int empId, String ename, double salary, Department dept) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public Employee(int empId, String ename, double salary, Department dept, List<String> specialization) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept
				+ ", specialization=" + specialization + "]";
	}

	

	
}
