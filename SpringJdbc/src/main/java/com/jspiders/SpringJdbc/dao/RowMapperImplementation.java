package com.jspiders.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jspiders.SpringJdbc.entities.Student;

public class RowMapperImplementation implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s1 = new Student();
		s1.setRollNo(rs.getInt("rollNo"));
		s1.setName(rs.getString("name"));
		s1.setCity(rs.getString("city"));
		return s1;
	}

}
