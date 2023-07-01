package com.jspiders.SpringJdbc.dao;

import java.util.List;

import com.jspiders.SpringJdbc.entities.Student;

public interface StudentDao {

		public int insert(Student student);
		public int update(Student student);
		public int delete(int rollNo);
		/* to get only one record*/
		public Student getStudent(int rollNo);
		public List<Student> getAllStudent();
}
