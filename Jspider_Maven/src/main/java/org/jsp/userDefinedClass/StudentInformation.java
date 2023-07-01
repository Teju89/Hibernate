package org.jsp.userDefinedClass;

public class StudentInformation 
{
	 public int rollNo;
	 public String name;
	
	
	 
	public StudentInformation() {
		super();
	}


	public StudentInformation(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}	

	
	public void study()
	{
		System.out.println("Learning is a continuous phase of a life...");
	}
}
