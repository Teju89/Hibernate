package com.jspiders.SpringJdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jspiders.SpringJdbc.dao.StudentDao;
import com.jspiders.SpringJdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Spring Jdbc started....");
		//ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		/*
		 * Not recommeded JdbcTemplate template = context.getBean("jdbcTemplate",
		 * JdbcTemplate.class); String query = "insert into student values(?,?,?)";
		 * //carry query from java to db int record = template.update(query, 101, "tej",
		 * "Bhusawal");
		 * 
		 * System.out.println("No of records inserted = " + record);
		 */
		StudentDao dao = context.getBean("studentdao", StudentDao.class);

//		Student student = new Student();
//		student.setRollNo(103);
//		student.setCity("KPHB");
//		student.setName("Deven");
//		int sample = dao.insert(student);
//		if (sample > 0) {
//			System.out.println("Inserted....");
//		}

//		Student student1 = new Student();
//		student1.setRollNo(102);
//		student1.setName("amar");
//		student1.setCity("Raichur");
//		int record = dao.update(student1);
//		if (record > 0) {
//			System.out.println("Updated...");
//		} else {
//			System.err.println("Invalid...");
//		}

//		int record = dao.delete(101);
//		if (record > 0) {
//			System.out.println("Deleted...");
//		} else {
//			System.err.println("Invalid...");
//		}
		
//		Student student = dao.getStudent(102);
//		System.out.println(student);
		
		List<Student> allStudents = dao.getAllStudent();
		for (Student student : allStudents) {
			System.out.println(student);
			System.out.println("**************");
		}
	}
}




















