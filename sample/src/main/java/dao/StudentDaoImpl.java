package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import model.Student;
@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int register(Student student) {
		String query = "insert into student values(?,?,?)";
		int record =  template.update(query, student.getRollNo(), student.getName(), student.getCity());
		return record;
	}

}
