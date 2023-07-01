package com.jspiders.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jspiders.SpringJdbc.entities.Student;

@Component("studentdao")
public class StudentDaoImplementation implements StudentDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(Student student) {
		String query = "insert into student values(?,?,?)";
		int r = this.template.update(query, student.getRollNo(), student.getName(), student.getCity());
		return r;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int update(Student student) {
		String query = "update student set name = ?, city = ? where rollNo = ?";
		int r = this.template.update(query, student.getName(), student.getCity(), student.getRollNo());
		return r;
	}

	@Override
	public int delete(int rollNo) {
		String query = "delete from student where rollNo = ?";
		int r = this.template.update(query, rollNo);
		return r;
	}

	@Override
	public Student getStudent(int rollNo) {
		//fetch single student record
		String query = "select * from student where rollNo = ?";
//		RowMapper<Student> rowMapper = new RowMapperImplementation();
//		Student s1 = this.template.queryForObject(query, rowMapper, rollNo);
		
		Student s1 = this.template.queryForObject(query, new RowMapper<Student>() {
			
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s1 = new Student();
				s1.setRollNo(rs.getInt("rollNo"));
				s1.setName(rs.getString("name"));
				s1.setCity(rs.getString("city"));
				return s1;
			}
		}, rollNo);
		return s1;
	}

	@Override
	public List<Student> getAllStudent() {
		// fetch multiple student data
		String query = "select * from student";
		
		RowMapper<Student> rowMapper = new RowMapperImplementation();
		List<Student> allStudent = this.template.query(query, rowMapper);
		return allStudent;
	}

}






















