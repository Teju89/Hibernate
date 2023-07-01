package org.jsp.annotation2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* @Qualifier/@Primary annotation only if there are multiple objects of same type*/
@Qualifier
@Component
public class Author 
{
	private String name;
	private String mobile;
	private String specialization;
	
	public Author(@Value("John") String name,@Value("1234567890") String mobile,@Value("Developement") String specialization) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", mobile=" + mobile + ", Specialization=" + specialization + "]";
	}
	
	

}
