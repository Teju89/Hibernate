package org.jsp.utility.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * dao --> data access object --> to access data from database/ to insert (jdbc code)
 */
public class RegistrationDao 
{
	public int registrationDao(RegistrationDto dto) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "insert into test.jspiders values(?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setString(1, dto.getFullName());
		ps.setString(2, dto.getMobile());
		ps.setString(3, dto.getEmail());
		ps.setString(4, dto.getPassword());
		
		int noOfRecord = ps.executeUpdate();
		System.out.println("Record inserted...");
		return noOfRecord;
	}
}
