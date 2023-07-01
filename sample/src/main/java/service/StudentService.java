package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.Student;

@Service
public class StudentService 
{
	@Autowired
	private StudentDao dao;
	
	public int createStudent(Student student)
	{
		return this.dao.register(student);
	}
}
